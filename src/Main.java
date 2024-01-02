public class Main {
    public static void main(String[] args) {
//        MealOrder regularMeal = new MealOrder();
//        regularMeal.addBurgerTopping("BACON", "CHEESE", "MAYO");
//        regularMeal.setDrinkSize("LARGE");
//        regularMeal.printItemizedList();

//        MealOrder secondMeal = new MealOrder("turkey", "coke", "chilli");
//        secondMeal.addBurgerTopping("LETTUCE", "CHEESE", "MAYO");
//        secondMeal.setDrinkSize("SMALL");
//        secondMeal.printItemizedList();

        MealOrder deluxeMeal = new MealOrder("deluxe", "juice", "fries");
        deluxeMeal.addBurgerTopping("LETTUCE", "CHEESE", "MAYO", "AVOCADO", "HAM");
        deluxeMeal.setDrinkSize("SMALL");
        deluxeMeal.printItemizedList();
//        Burger burger = new Burger("regular", 4.00);
//        burger.addToppings("BEEF", "CHEESE", "MAYO");
//        burger.printItem();

//        Item coke = new Item("drink", "coke", 1.50);
//        coke.printItem();
//        coke.setSize("LARGE");
//        coke.printItem();
//
//        Item avocado = new Item("topping", "avocado", 1.50);
//        avocado.printItem();
    }
}