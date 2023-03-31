public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder builder = new MealBuilder();
        Meal info = builder.prepareVegMealAndCoke();
        info.showItems();

        MealBuilder builder2 = new MealBuilder();
        Meal info2 = builder2.prepareNonVegMealAndCoke();
        info2.showItems();

        MealBuilder builder3 = new MealBuilder();
        Meal info3 = builder3.prepareVegMealAndPepsi();
        info3.showItems();

        MealBuilder builder4 = new MealBuilder();
        Meal info4 = builder4.prepareNonVegMealAndPepsi();
        info4.showItems();
    };
}
