import {Component, Input, OnInit} from '@angular/core';

@Component({
  selector: 'app-basket-total',
  templateUrl: './basket-total.component.html',
  styleUrls: ['./basket-total.component.css']
})
export class BasketTotalComponent implements OnInit {

  @Input() price: string;
  @Input() isHeader: boolean;

  constructor() { }

  ngOnInit() {
  }

}
