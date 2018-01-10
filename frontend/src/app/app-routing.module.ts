import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {Route, RouterModule, Routes} from '@angular/router';


import { AppComponent } from './app.component';
import {RecipeCategoryComponent} from "./recipe-category/recipe-category.component";
import {RecipeComponent} from "./recipe/recipe.component";
import {RecipeListComponent} from "./recipe-list/recipe-list.component";
import {CommonModule} from "@angular/common";



const routes:Route[] = [
  {
    path: '',
    redirectTo: '/category',
    pathMatch: 'full'
  },
  {
    path: 'category',
    component: RecipeCategoryComponent
  },
  {
    path: 'recipes',
    component: RecipeListComponent
  },
  {
    path: 'recipe',
    component: RecipeComponent
  }
];

@NgModule({
  imports: [
    CommonModule,
    RouterModule.forRoot(routes)
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
