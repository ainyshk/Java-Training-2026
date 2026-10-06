public class Abstraction {
    public static void main(String[] args) {
        T_Shirt myTShirt = new T_Shirt("Blue", "big", 200.00);
        System.out.println(myTShirt.getDescription());

        Jacket myJacket = new Jacket("Black", 200.00, "Patagonia");
        System.out.println(myJacket.getDescription());

        System.out.println(myTShirt.price + myJacket.price);
    
    }
}

abstract class Shirt {
    String color;

    public Shirt(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }
    
    public abstract String getDescription();
}

class T_Shirt extends Shirt {
    String size;
    double price;

    public T_Shirt(String color, String size, double price) {
        super(color);
        this.size = size;
        this.price = price;
    }

    @Override
    public String getDescription() {
        return (color + " " + size + " " + price);
    }
}

class Jacket extends Shirt {
    double price;
    String brand;

    public Jacket(String color, double price, String brand) {
        super(color);
        this.price = price;
        this.brand = brand;
    }

    @Override
    public String getDescription() {
        return (color + " " + brand + " for $" + price);
    }
}