public class Item {
    private String type;
    private String name;
    private double price;

    private String size = "Medium";

    public Item(String type, String name, double price) {
        this.type = type.toUpperCase();
        this.name = name.toUpperCase();
        this.price = price;
    }

    public String getName() {
        if(type.equals("SIDE") || type.equals("DRINK")){
            return size + " " + name;
        }
        return name;
    }

    public double getBasePrice() {
        return price;
    }

    public double getAdjustPrice() {
        return switch(size) {
            case "SMALL" -> getBasePrice() - 0.5;
            case "LARGE" -> getBasePrice() + 1;
            default -> getBasePrice();
        };
    }

    public void setSize(String size) {
        this.size = size;
    }

    public static void printItem(String name, Double price) {
        System.out.printf("%20s: %6.2f%n", name, price);
        //%20s => 指定String的字數20
        //%6.2f => 6個字符其中包括空格和數字, 小數點到第二位
    }

    public void printItem() {
        printItem(getName(), getAdjustPrice());
    }
}
