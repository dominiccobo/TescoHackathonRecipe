import {AfterViewInit, Component, OnInit, ViewChild} from '@angular/core';
import {MatPaginator, MatSort, MatTableDataSource} from '@angular/material';

@Component({
  selector: 'app-ingredient',
  templateUrl: './ingredient.component.html',
  styleUrls: ['./ingredient.component.css']
})
export class IngredientComponent implements OnInit, AfterViewInit {

    public metadata: ingredientData;

    storeRangeColumns = ['image', 'name', 'price'];
    storeRangeData: MatTableDataSource<StoreIngredient>;

    @ViewChild(MatPaginator) storeRangePaginator: MatPaginator;
    @ViewChild(MatSort) storeRangeSort: MatSort;

    homeRangeColumns = ['image', 'name'];
    homeRangeData: MatTableDataSource<HomeIngredient>;

    @ViewChild('PaginatorHome') homeRangePaginator: MatPaginator;
    @ViewChild(MatSort) homeRangeSort: MatSort;

  constructor() {

      let data: StoreIngredient[] = [
          {
              image: 'test',
              name: 'test',
              price: '22'
          },
          {
              image: 'test 2',
              name: 'test',
              price: '42'
          },
          {
              image: 'test',
              name: 'test',
              price: '22'
          },
          {
              image: 'test 2',
              name: 'test',
              price: '42'
          },
          {
              image: 'test',
              name: 'test',
              price: '22'
          },
          {
              image: 'test 2',
              name: 'test',
              price: '42'
          },
          {
              image: 'test',
              name: 'test',
              price: '22'
          },
          {
              image: 'test 2',
              name: 'test',
              price: '42'
          },
          {
              image: 'test',
              name: 'test',
              price: '22'
          },
          {
              image: 'test 2',
              name: 'test',
              price: '42'
          },
          {
              image: 'test',
              name: 'test',
              price: '22'
          },
          {
              image: 'test 2',
              name: 'test',
              price: '42'
          }
      ];

      this.storeRangeData = new MatTableDataSource(data);

      let anotherData: HomeIngredient[] = [
          {
              name: 'test',
              image: 'test'
          },
          {
              name: 'test',
              image: 'test'
          }
      ];

      this.homeRangeData = new MatTableDataSource(anotherData);
  }

  ngOnInit() {
  }

  ngAfterViewInit() {
      this.storeRangeData.paginator = this.storeRangePaginator;
      this.storeRangeData.sort = this.storeRangeSort;

      this.homeRangeData.paginator = this.homeRangePaginator;
      this.homeRangeData.sort = this.homeRangeSort;
  }
}

interface ingredientData {
    genericName: string;
}

interface StoreIngredient {
    image: string;
    name: string;
    price: string;
}

interface HomeIngredient {
    image: string;
    name: string;
}
