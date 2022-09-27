# Bread
Bread

package Intermediate2150;

import Intermediate2150.Pastry;
import Intermediate2150.SourdoughBread;

public class Main {

    public static void main(String[] args) {

        // build and test Sourdough
        StringBuilder sourdoughRecipe = new StringBuilder();
        sourdoughRecipe.append("1. Mix flour, water, salt, baking powder, yeast, and ripe sourdough starter.\n");
        sourdoughRecipe.append("2. Make the dough\n");
        sourdoughRecipe.append("3. Bulk Rise\n");
        sourdoughRecipe.append("4. Stretch and fold the dough\n");
        sourdoughRecipe.append("5. Cut and shape the dough\n");
        sourdoughRecipe.append("6. Second rise\n");
        sourdoughRecipe.append("6. Preheat the oven to 450°F towards the tail end of the second rise.\n");
        sourdoughRecipe.append("7. Spray the loaf with luke warm water.\n");
        sourdoughRecipe.append("8. Bake the bread at 400°F for 20 minutes, until deep golden brown.\n");
        sourdoughRecipe.append("9. Remove the bread from the oven.\n");
        sourdoughRecipe.append("10.Let the bread cool until good to eat.");
        String recipe = sourdoughRecipe.toString();

        SourdoughBread dough = new SourdoughBread("sourdough",recipe, 1.5d, 2.5d, 0.0d, 1.0d,
                1.0,  1.2, 1.0d);

        System.out.println("Ingredients of " +  dough.getClass().getSimpleName()+ " bread are:");
        System.out.println(dough.getIngredients());
        System.out.println();

        System.out.println("A recipe for " + dough.getClass().getSimpleName() + " is");
        System.out.println(dough.getRecipe());
        System.out.println();

        System.out.println("The bread has been baked: " + dough.isBaked());

        System.out.println("Let's bake the bread now.");
        dough.baked();
        System.out.println("The bread has been baked: " + dough.isBaked());
        System.out.println();

        // build and test Pastry
        StringBuilder pastryRecipe = new StringBuilder();
        pastryRecipe.append("1. Mix sugar, pastry flour, salt, water, and fat together\n");
        pastryRecipe.append("2. Fluff dough with fingers and make sure it feels light\n");
        pastryRecipe.append("3. Roll dough with rolling pin\n");
        pastryRecipe.append("4. Put dough in fridge and leave for 3 hours, then enjoy\n");
        recipe = pastryRecipe.toString();

        Pastry pastry = new Pastry("Pastry", recipe, 2.0, 2.0,
                3.0, 1.0, 2.3, 1.2,
                 3.0, 4.0 );

        System.out.println("Ingredients of " + pastry.getClass().getSimpleName() + " bread are:");
        System.out.println(pastry.getIngredients());
        System.out.println();

        System.out.println("A Recipe for a Pastry:");
        System.out.println(pastry.getRecipe());

    }
}

