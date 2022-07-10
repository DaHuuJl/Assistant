import {Component, Input, OnInit} from '@angular/core';
import {Menu} from "../../model/default/Menu";
import {MenuService} from "../../service/MenuService";

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {
  @Input() selectedMenu?: string;
  menu: Menu[];

  constructor(private menuService: MenuService) {
    this.menu = this.menuService.getMenu();
  }

  ngOnInit(): void {

  }
}
