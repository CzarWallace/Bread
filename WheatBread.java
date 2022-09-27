# Bread
Bread

package Intermediate2150;

public class WheatBread extends SourdoughBread{


    double flour;
    double water;
    double sugar;
    double eggs;
    double milk;
    double butter;

    public WheatBread(String ingredients, String recipe, double flour, double water, double salt, double sugar,
                      double bakingPowder, double yeast, double ripeSourdoughStarter, double flour1, double
                              water1, double sugar1, double eggs, double milk, double butter) {
        super(ingredients, recipe, flour, water, salt, sugar, bakingPowder, yeast, ripeSourdoughStarter);
        this.flour = flour1;
        this.water = water1;
        this.sugar = sugar1;
        this.eggs = eggs;
        this.milk = milk;
        this.butter = butter;
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
    public double getSugar() {
        return sugar;
    }

    @Override
    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    public double getEggs() {
        return eggs;
    }

    public void setEggs(double eggs) {
        this.eggs = eggs;
    }

    public double getMilk() {
        return milk;
    }

    public void setMilk(double milk) {
        this.milk = milk;
    }

    public double getButter() {
        return butter;
    }

    public void setButter(double butter) {
        this.butter = butter;
    }
    public String isRecipe(){
        return ("Mix egg, wheat flour, salt, milk, water and butter" +
                "Make the dough" +
                "Let dough rise " +
                "Heat oven for 30 minute" +
                "Let bread get cold" +
                "enjoy your bread");
    }

    @Override
    public String toString() {
        return "WheatBread{" +
                "flour=" + flour +
                ", water=" + water +
                ", sugar=" + sugar +
                ", eggs=" + eggs +
                ", milk=" + milk +
                ", butter=" + butter +
                '}';
    }
}
