import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import {AppRoutingModule} from './app-routing.module';
import { RecipeCategoryComponent } from './recipe-category/recipe-category.component';
import { RecipeComponent } from './recipe/recipe.component';
import { IngredientComponent } from './ingredient/ingredient.component';
import { RecipeListComponent } from "./recipe-list/recipe-list.component";

import { MatToolbarModule } from '@angular/material';

@NgModule({
  declarations: [
    AppComponent,
    RecipeListComponent,
    RecipeCategoryComponent,
    RecipeComponent,
    IngredientComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    MatToolbarModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
