import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-recipe-category',
  templateUrl: './recipe-search.component.html',
  styleUrls: ['./recipe-search.component.css']
})
export class RecipeCategoryComponent implements OnInit {

  public categories: string[] = [
      'Breakfast',
      'Main Course',
      'Snack',
      'Desserts',
      'Starters'
  ];

  constructor() { }

  ngOnInit() {
  }

}
