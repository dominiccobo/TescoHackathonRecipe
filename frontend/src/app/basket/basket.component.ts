import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-basket',
  templateUrl: './basket.component.html',
  styleUrls: ['./basket.component.css']
})
export class BasketComponent implements OnInit {

  basketItems: string[] = [
      'eggs',
      'bread',
      'milk'
  ];

  price = 2.00;

  constructor() { }

  ngOnInit() {
  }

}
