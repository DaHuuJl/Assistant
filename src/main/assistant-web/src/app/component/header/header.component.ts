import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {AuthService} from "../../service/AuthService";
import {NavigateService} from "../../service/NavigateService";

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {
  @Output() onClickMenu = new EventEmitter;

  constructor(public authService: AuthService,
              public navigateService: NavigateService) {

  }

  ngOnInit(): void {
  }

  public openMenu(): void {
    this.onClickMenu.emit();
  }

  public toHome(): void {
    this.navigateService.navigateToHome();
  }

  public toProfile(): void {
    this.navigateService.navigateToProfile();
  }

  public toSettings(): void {
    this.navigateService.navigateToSettings();
  }

  public logoff(): void {
    this.authService.logoff();
  }
}
