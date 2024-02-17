package Bread;

public class Recipe extends Bread {
    public Recipe(String breadName, String bpn) {
        System.out.printf("A recipe for %s:", breadName);
        System.out.println(" ");
        if (bpn != null) {
            System.out.printf("1. Mix flour, water, salt, baking powder, yeast, and %s", bpn);
            System.out.println(" ");
        } else {
            System.out.println("1. Mix flour, water, salt, and yeast");
        }
        System.out.println("2. Make the dough");
        System.out.println("3. Bulk rise");
        System.out.println("4. Stretch and fold the dough");
        System.out.println("5. Cut and shape the dough");
        System.out.println("6. Second rise");
        System.out.println("7. Preheat the oven at 450 degrees Fahrenheit towards the tail end" +
                " of the second rise");
        System.out.println("8. Spray the loaf with luke warm water");
        System.out.println("9. Bake the bread at 400 degrees Fahrenheit for 20 minutes, until" +
                " deep golden brown");
        System.out.println("10. Remove the bread from the oven");
        System.out.println("11. Let the bread cool until good to eat");
        bake(breadName);
        System.out.printf("The %s is baked now", breadName);
        System.out.println(" ");
        System.out.println(" ");
    }

    public void bake(String str) {
        super.bake(str);
    }
}
