import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {Route, RouterModule, Routes} from '@angular/router';


import { AppComponent } from './app.component';
import {RecipeCategoryComponent} from "./recipe-search/recipe-search.component";
import {RecipeComponent} from "./recipe/recipe.component";
import {RecipeListComponent} from "./recipe-results/recipe-results.component";
import {CommonModule} from "@angular/common";
import {IngredientComponent} from "./ingredient/ingredient.component";
import {BasketComponent} from "./basket/basket.component";



const routes:Route[] = [
    {
        path: '',
        redirectTo: '/search',
        pathMatch: 'full'
    },
    {
        path: 'search',
        component: RecipeCategoryComponent
    },
    {
        path: 'results',
        component: RecipeListComponent
    },
    {
        path: 'recipe',
        component: RecipeComponent
    },
    {
        path: 'basket',
        component: BasketComponent
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
