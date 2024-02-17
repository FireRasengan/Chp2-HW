package Bread;

public class BreadTester {
    public static void main(String[] args) {
        Bread bread = new Bread();
        Recipe recipe1 = new Recipe("Sourdough Bread", "ripe sourdough starter");
        Bread sourdough = new Bread(5.0, 1.5, 2.5,0, 1.0,
                1.0, "ripe sourdough starter", "Sourdough Bread",
                false, recipe1);
        Recipe recipe2 = new Recipe("Pita Bread", null);
        Bread pita = new Bread(3.5, 1.25, 1.0, 0.0, 1.0,
                0.0, null, "Pita Bread", false, recipe2);
        Recipe recipe3 = new Recipe("Baguette", null);
        Bread baguette = new Bread(4.5, 1.5, 2.0, 0.0, 1.75,
                0.0, null, "Baguette", false, recipe3);
    }
}
