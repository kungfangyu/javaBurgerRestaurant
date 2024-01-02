public class MealOrder {
    private Burger burger;
    private Item drink;
    private Item side;

    public MealOrder(){
        this("regular", "coke", "fries");
    }
    public MealOrder(String burgerType, String drinkType, String sideType) {
        if(burgerType.equalsIgnoreCase("deluxe")){
            this.burger = new DeluxeBurger(burgerType, 8.5);
        } else {
            this.burger = new Burger(burgerType, 4.0);
        }
        this.drink = new Item("drink", drinkType, 1.00);
        this.side = new Item("side", sideType, 1.50);
    }

    public double getTotalPrice() {
        if(burger instanceof DeluxeBurger) {
            return burger.getAdjustPrice();
        }
        return burger.getAdjustPrice() + drink.getAdjustPrice() + side.getAdjustPrice();
    }

    public void printItemizedList() {
        burger.printItem();
        if(burger instanceof DeluxeBurger) {
            //如果是deluxe的話飲料跟配菜都不需要加價
            Item.printItem(drink.getName(), 0.0);
            Item.printItem(side.getName(), 0.0);
        } else {
            drink.printItem();
            side.printItem();
        }
        System.out.println("-".repeat(30));
        Item.printItem("Total price: ", getTotalPrice());
    }

    public void addBurgerTopping(String extra1, String extra2, String extra3) {
        burger.addToppings(extra1, extra2, extra3);
    }

    public void addBurgerTopping(String extra1, String extra2, String extra3, String extra4, String extra5) {
        if(burger instanceof DeluxeBurger db) {
            db.addToppings(extra1, extra2, extra3, extra4, extra5);
        } else{
            burger.addToppings(extra1, extra2, extra3);
        }
    }

    public void setDrinkSize(String size) {
        drink.setSize(size);
    }
}
