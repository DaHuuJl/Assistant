export class Menu {
  public title: string;
  public path: string;
  public img: string;
  public alt: string;
  public selected: boolean;

  constructor(title: string, path: string, img: string, alt: string) {
    this.title = title;
    this.path = path;
    this.img = img;
    this.alt = alt;
    this.selected = false;
  }
}
