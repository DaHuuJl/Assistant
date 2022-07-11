import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-grade-book',
  templateUrl: './grade-book.component.html',
  styleUrls: ['./grade-book.component.css']
})
export class GradeBookComponent implements OnInit {
  title = "grade-book";
  menuItem = "/grade-book";

  constructor() { }

  ngOnInit(): void {
  }

}
