import {Injectable} from "@angular/core";
import {Router} from "@angular/router";

@Injectable({providedIn: 'root'})
export class NavigateService {

  constructor(private router: Router) {}

  public navigateToHome(): void {
    this.router.navigate(['/']);
  }

  public navigateToAbout(): void {
    this.router.navigate(['about']);
  }

  public navigateToSettings(): void {
    this.router.navigate(['settings']);
  }

  public navigateToProfile(): void {
    this.router.navigate(['profile']);
  }

  public navigateToSchedule(): void {
    this.router.navigate(['schedule']);
  }

  public navigateToEvents(): void {
    this.router.navigate(['events']);
  }

  public navigateToGradeBook(): void {
    this.router.navigate(['grade-book']);
  }

  public navigateToReference(): void {
    this.router.navigate(['reference']);
  }

  public navigateToDocuments(): void {
    this.router.navigate(['documents']);
  }

  // public navigateToSchedule(): void {
  //   this.router.navigate(['schedule']);
  // }
}
