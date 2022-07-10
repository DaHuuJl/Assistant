import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-reference',
  templateUrl: './reference.component.html',
  styleUrls: ['./reference.component.css']
})
export class ReferenceComponent implements OnInit {
  title = "reference";
  menuItem = "/reference";

  constructor() { }

  ngOnInit(): void {
  }

}
