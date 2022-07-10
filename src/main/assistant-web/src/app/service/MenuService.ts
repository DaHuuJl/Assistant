import {Injectable} from "@angular/core";
import {Menu} from "../model/default/Menu";

@Injectable({providedIn: 'root'})
export class MenuService {

  private menu: Menu[] = [
    new Menu("Главная", "/", "../../../assets/home.svg", "home"),
    new Menu("Расписание", "/schedule", "../../../assets/calendar.svg", "calendar"),
    new Menu("Зачётная книжка", "/grade-book", "../../../assets/note.svg", "note"),
    new Menu("Получить справку", "/reference", "../../../assets/new_file.svg", "new_file"),
    new Menu("Мои документы", "/documents", "../../../assets/documents.svg", "documents"),
    new Menu("События", "/events", "../../../assets/world.svg", "world"),
    new Menu("Вакансии", "/vacancy", "../../../assets/work.svg", "work"),
  ];

  constructor() {

  }

  public getMenu(): Menu[] {
    return this.menu;
  }
}
