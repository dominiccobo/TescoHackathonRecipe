import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-recipe',
  templateUrl: './recipe.component.html',
  styleUrls: ['./recipe.component.css']
})
export class RecipeComponent implements OnInit {

  public listOfIngredients: ingredientChoice[] = [
      {
          ingredientName: 'Sausages',
          foundInProductRange: [
              'Tesco Finest Bramley Sausages',
              'Richmond Frozen Sausages',
          ],
          foundInHomeSupplies: [
              'Tesco Everyday Value Sausages'
          ]
      }
  ];

  constructor() { }

  ngOnInit() {
  }

}

/**
 * Interface specifying the choice of ingredient sources for a generic ingredient.
 */
interface ingredientChoice {

    /**
     * Name of generic ingredient, i.e. flour.
     */
    ingredientName: string;

    /**
     * Specific product in range.
     */
    foundInProductRange: string[];

    /**
     * Found in the home supplies.
     */
    foundInHomeSupplies: string[];

}