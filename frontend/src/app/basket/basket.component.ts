import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-basket',
  templateUrl: './basket.component.html',
  styleUrls: ['./basket.component.css']
})
export class BasketComponent implements OnInit {

  basketItems: string[] = [
      'item 1',
      'item 2',
      'item 3'
  ];

  price = 2.00;

  constructor() { }

  ngOnInit() {
  }

}
