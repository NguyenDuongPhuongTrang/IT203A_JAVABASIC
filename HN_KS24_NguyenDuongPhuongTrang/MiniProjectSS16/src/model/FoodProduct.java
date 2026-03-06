<<<<<<< HEAD
package model;

public class FoodProduct extends Product {

    private int discountPercent;

    public FoodProduct(String id, String name, double price, int discountPercent) {
        super(id, name, price);
        this.discountPercent = discountPercent;
    }

    @Override
    public double calculateFinalPrice() {
        return price - (price * discountPercent / 100);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Phần trăm giảm giá: " + discountPercent + "%");
    }
}
=======
package model;

public class FoodProduct extends Product {

    private int discountPercent;

    public FoodProduct(String id, String name, double price, int discountPercent) {
        super(id, name, price);
        this.discountPercent = discountPercent;
    }

    @Override
    public double calculateFinalPrice() {
        return price - (price * discountPercent / 100);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Phần trăm giảm giá: " + discountPercent + "%");
    }
}
>>>>>>> 97faaa4ea5e9811bc5ca84cf5717b53ddd74d73c
