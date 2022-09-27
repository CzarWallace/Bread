# Bread
Bread
package Intermediate2150;

public class SourdoughBread extends BreadSuperClass {

    double flour;
    double water;
    double salt;
    double sugar;
    double bakingPowder;
    double yeast;
    double ripeSourdoughStarter;


    public SourdoughBread(String ingredients, String recipe, double flour, double water, double salt,
                          double sugar, double bakingPowder, double yeast, double ripeSourdoughStarter) {
        super(ingredients, recipe);
        this.flour = flour;
        this.water = water;
        this.salt = salt;
        this.sugar = sugar;
        this.bakingPowder = bakingPowder;
        this.yeast = yeast;
        this.ripeSourdoughStarter = ripeSourdoughStarter;
    }

    @Override
    public double getFlour() {
        return flour;
    }

    @Override
    public void setFlour(double flour) {
        this.flour = flour;
    }

    @Override
    public double getWater() {
        return water;
    }

    @Override
    public void setWater(double water) {
        this.water = water;
    }

    @Override
    public double getSalt() {
        return salt;
    }

    @Override
    public void setSalt(double salt) {
        this.salt = salt;
    }

    @Override
    public double getSugar() {
        return sugar;
    }

    @Override
    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    @Override
    public double getBakingPowder() {
        return bakingPowder;
    }

    @Override
    public void setBakingPowder(double bakingPowder) {
        this.bakingPowder = bakingPowder;
    }

    @Override
    public double getYeast() {
        return yeast;
    }

    @Override
    public void setYeast(double yeast) {
        this.yeast = yeast;
    }

    public double getRipeSourdoughStarter() {
        return ripeSourdoughStarter;
    }

    public void setRipeSourdoughStarter(double ripeSourdoughStarter) {
        this.ripeSourdoughStarter = ripeSourdoughStarter;
    }

    public String isRecipe(){
        //System.out.print("A recipe for Sourdough is");
        return ("mix flour, water,  salt,  sugar,  baking Powder, yeast, ripe sourdough starter" +
                " Make the dough" +
                "Bulk Rise" +
                "Stretch and forld the dough" +
                "Cut and shape the dough" +
                "Second rise" +
                "Preheat the oven to 450 °F towards the tail end of the second rise." +
                "Spray the loaf with luke warm water." +
                "Bake the bread at 400 °F for 20 minutes, until deep golden brown." +
                "Remove the bread from the oven." +
                "Let the bread cool until good to eat.");
    }

    @Override
    public String toString() {
        return "SourdoughBread{" +
                "flour=" + flour +
                ", water=" + water +
                ", salt=" + salt +
                ", sugar=" + sugar +
                ", bakingPowder=" + bakingPowder +
                ", yeast=" + yeast +
                ", ripeSourdoughStarter=" + ripeSourdoughStarter +
                '}';
    }
}


