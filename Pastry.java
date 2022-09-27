# Bread
Bread
package Intermediate2150;

public class Pastry extends SourdoughBread{
    double pastryFlour;
    double flour;
    double water;
    double salt;
    double sugar;
    double bakingPowder;
    double yeast;

    public Pastry(String ingredients, String recipe, double flour, double water, double salt, double sugar,
                  double bakingPowder, double yeast, double ripeSourdoughStarter, double pastryFlour) {

        super(ingredients, recipe, flour, water, salt, sugar, bakingPowder, yeast, ripeSourdoughStarter);
        this.pastryFlour = pastryFlour;
    }

    public double getPastryFlour() {
        return pastryFlour;
    }

    public void setPastryFlour(double pastryFlour) {
        this.pastryFlour = pastryFlour;
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

    public String  isRecipe(){
        return ("Mix sugar, pastry flour, salt, water and fat together" +
                "Fluff dough with fingers and make sure it feels light " +
                "Roll dough with rolling pin" +
                "Put dough in fridge and leave for 3 hours, then enjoy");
    }
}
