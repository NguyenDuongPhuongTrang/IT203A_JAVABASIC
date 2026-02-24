abstract class Drink{
    protected int id;
    protected String name;
    protected double price;
    public Drink(int id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    abstract double calculatePrice();

    public void displayInfor(){
        System.out.printf("Ma: %d\nTen: %s\nGia: %.2f\n", id, name, price);
    }
}


