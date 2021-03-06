import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import {AppRoutingModule} from './app-routing.module';
import { RecipeCategoryComponent } from './recipe-search/recipe-search.component';
import { RecipeComponent } from './recipe/recipe.component';
import { IngredientComponent } from './ingredient/ingredient.component';
import { RecipeListComponent } from './recipe-results/recipe-results.component';

import {
    MatButtonModule,
    MatCardModule,
    MatGridListModule,
    MatIconModule,
    MatInputModule,
    MatPaginatorModule, MatSidenav, MatSidenavModule, MatSliderModule,
    MatTableModule,
    MatToolbarModule
} from '@angular/material';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {CdkTableModule} from "@angular/cdk/table";
import {ReactiveFormsModule} from "@angular/forms";
import { BasketComponent } from './basket/basket.component';
import { BasketTotalComponent } from './basket/basket-total/basket-total.component';

@NgModule({
  declarations: [
    AppComponent,
    RecipeListComponent,
    RecipeCategoryComponent,
    RecipeComponent,
    IngredientComponent,
    BasketComponent,
    BasketTotalComponent
  ],
  imports: [
        BrowserModule,
        BrowserAnimationsModule,
        AppRoutingModule,
        MatToolbarModule,
        MatGridListModule,
        MatIconModule,
        MatInputModule,
        MatButtonModule,
        MatCardModule,
        MatTableModule,
        MatPaginatorModule,
        CdkTableModule,
        ReactiveFormsModule,
        MatSidenavModule,
        MatSliderModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
