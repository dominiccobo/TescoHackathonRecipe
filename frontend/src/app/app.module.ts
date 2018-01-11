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
    MatPaginatorModule,
    MatTableModule,
    MatToolbarModule
} from '@angular/material';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {CdkTableModule} from "@angular/cdk/table";
import {ReactiveFormsModule} from "@angular/forms";

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
        ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
