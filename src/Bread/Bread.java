package Bread;

public class Bread {
    private double flour;
    private double water;
    private double salt;
    private double sugar;
    private double yeast;
    private double bakingPowder;
    private String bpn;
    private String breadName;
    private boolean isBaked;
    private Recipe recipe;

    public Bread() {
    }

    public Bread(double flour, double water, double salt, double sugar, double yeast,
                 double bakingPowder,String bpn, String breadName, boolean isBaked, Recipe recipe) {
        this.flour = flour;
        this.water = water;
        this.salt = salt;
        this.sugar = sugar;
        this.yeast = yeast;
        this.bakingPowder = bakingPowder;
        this.breadName = breadName;
        this.isBaked = isBaked;
        getIngredients(flour, water, salt, yeast, bakingPowder, bpn);
        this.recipe = recipe;
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

    public double getYeast() {
        return yeast;
    }

    public void setYeast(double yeast) {
        this.yeast = yeast;
    }

    public double getBakingPowder() {
        return bakingPowder;
    }

    public void setBakingPowder(double bakingPowder) {
        this.bakingPowder = bakingPowder;
    }

    public String getBpn() {
        return bpn;
    }

    public void setBpn(String bpn) {
        this.bpn = bpn;
    }

    public String getBreadName() {
        return breadName;
    }

    public void setBreadName(String breadName) {
        this.breadName = breadName;
    }

    public boolean isBaked() {
        return isBaked;
    }

    public void setBaked(boolean baked) {
        isBaked = baked;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public void bake(String str) {
        System.out.printf("Can't bake, %s is already baked", str);
        System.out.println(" ");
    }

    public void getIngredients(double flour, double water, double salt, double yeast,
                               double bakingPowder, String bpn) {
        System.out.printf("Ingredients for %s:", breadName);
        System.out.println(" ");
        System.out.printf("%.2f cups of flour", flour);
        System.out.println(" ");
        System.out.printf("%.2f cups of water", water);
        System.out.println(" ");
        System.out.printf("%.2f tsps of salt", salt);
        System.out.println(" ");
        System.out.printf("%.2f tsps of yeast", yeast);
        System.out.println(" ");
        if (bpn != null) {
            System.out.printf("%.2f cups of %s", bakingPowder, bpn);
            System.out.println(" ");
        }
        System.out.println("____________________________________________");
    }
}
