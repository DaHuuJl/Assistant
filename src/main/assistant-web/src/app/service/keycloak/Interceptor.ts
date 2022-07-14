import {HttpClient, HttpErrorResponse, HttpHandler, HttpInterceptor, HttpRequest,} from '@angular/common/http';
import {catchError, Observable, throwError} from 'rxjs';
import {Injectable} from "@angular/core";

@Injectable()
export class AddHeaderInterceptor implements HttpInterceptor {

  isRefreshingToken = false;

  constructor(private http: HttpClient) {
  }

  intercept(req: HttpRequest<any>, next: HttpHandler): Observable<any> {
    let clonedRequest = req.clone({ headers: req.headers.append('Authorization', `Bearer ${sessionStorage.getItem('access_token')}`) });

    return next.handle(clonedRequest).pipe(catchError (error =>{
      if (error instanceof HttpErrorResponse && error.status === 401) {
        console.log("Ops... AccessToken устарел!")
        let refreshToken = sessionStorage.getItem("refresh_token");
        let body = new URLSearchParams();
        body.set('client_id', 'electronicassistant-front');
        body.set('grant_type', 'refresh_token');
        body.set('refresh_token', refreshToken!);
        this.http.post<any>('http://localhost:9080/auth/realms/electronicassistant/protocol/openid-connect/token',
          body.toString(),
          {headers:{'Content-Type': 'application/x-www-form-urlencoded'}}
        )
          .subscribe(res => {
            console.log(sessionStorage.getItem("access_token"))
            sessionStorage.removeItem("access_token");
            sessionStorage.setItem("access_token", res.access_token);
            console.log(sessionStorage.getItem("access_token"))
            this.isRefreshingToken = true;
            console.log("AccessToken успешно обновлен!")
          })
      }
      if(this.isRefreshingToken){
        this.isRefreshingToken = false;
        return next.handle(clonedRequest.clone({ headers: req.headers.append('Authorization', `Bearer ${sessionStorage.getItem('access_token')}`) })).pipe();
      }
      return throwError(error);
    }));
  }
}
