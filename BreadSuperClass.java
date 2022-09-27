# Bread
Bread
package Intermediate2150;

public class BreadSuperClass {
     boolean baked = false;
    double flour;
    double water;
    double salt;
    double sugar;
    double bakingPowder;
    double yeast;
    String breadName;
    String stateOfBread;


    private String ingredients;
    private String recipe;

    public BreadSuperClass(String ingredients, String recipe) {
        this.ingredients = ingredients;
        this.recipe = recipe;
    }

    public BreadSuperClass(double flour, double water, double salt, double sugar, double bakingPowder,
                           double yeast, String breadName, String stateOfBread) {
        this.flour = flour;
        this.water = water;
        this.salt = salt;
        this.sugar = sugar;
        this.bakingPowder = bakingPowder;
        this.yeast = yeast;
        this.breadName = breadName;
        this.stateOfBread = stateOfBread;


    }


        public double getFlour() {
        return flour;
    }

    public void setFlour(double flour) {
        this.flour = flour;
    }

    public double getWater() {
        return water;
    }

    public void setWater(double water) {
        this.water = water;
    }

    public double getSalt() {
        return salt;
    }

    public void setSalt(double salt) {
        this.salt = salt;
    }

    public double getSugar() {
        return sugar;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    public double getBakingPowder() {
        return bakingPowder;
    }

    public void setBakingPowder(double bakingPowder) {
        this.bakingPowder = bakingPowder;
    }

    public double getYeast() {
        return yeast;
    }

    public void setYeast(double yeast) {
        this.yeast = yeast;
    }

    public String getBreadName() {
        return breadName;
    }

    public void setBreadName(String breadName) {
        this.breadName = breadName;
    }

    public String getStateOfBread() {
        return stateOfBread;
    }

    public void setStateOfBread(String stateOfBread) {
        this.stateOfBread = stateOfBread;
    }

    public String getIngredients() {
        return ("5.0  cups of flour" +
                 " 1.5 cups of water" +
                "  2.5 tsps of salt" +
                "0.0 tsps of   sugar" +
                "1.0 tsps of baking Powder" +
                "1.0 tsps of  yeast,  1.0 cups of ripe sourdough starter");
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

  void baked(){
        baked = true;
  }

    public boolean isBaked() {
      return baked;


    }

    @Override
    public String toString() {
        return "BreadSuperClass{" +
                "flour=" + flour +
                ", water=" + water +
                ", salt=" + salt +
                ", sugar=" + sugar +
                ", bakingPowder=" + bakingPowder +
                ", yeast=" + yeast +
                ", breadName='" + breadName + '\'' +
                ", stateOfBread='" + stateOfBread + '\'' +
                ", ingredients='" + ingredients + '\'' +
                ", recipe=" + recipe +
                '}';
    }
}








