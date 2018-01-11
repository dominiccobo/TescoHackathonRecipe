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

  public numberOfDays: number = 7;
  public days:string[] = [
      'Monday',
      'Tuesday',
      'Wednesday',
      'Thursday',
      'Friday',
      'Saturday',
      'Sunday'
  ];

  public daysToShow:string[] = [];

  constructor() {
      for(let i = 0; i < this.numberOfDays; i++) {

          let day = i;
          this.daysToShow.push(this.days[day%7]);
      }
  }

  ngOnInit() {


  }

  public updateDays() {

      this.daysToShow.forEach(()=> {
            this.daysToShow.pop();
      });

      for(let i = 0; i < this.numberOfDays; i++) {

          console.log("numberOfDays " + this.numberOfDays);
          let day = i;

          if(day >= 6) {
              day =- 7;
          }

          this.daysToShow.push(this.days[i]);
          console.log(this.daysToShow)
      }

  }

}
