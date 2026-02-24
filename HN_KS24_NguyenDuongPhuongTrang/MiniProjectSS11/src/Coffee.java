class Coffee extends Drink implements IMixable {
    protected boolean hasMilk;

    public Coffee(int id, String name, double price, boolean hasMilk) {
        super(id, name, price);
        this.hasMilk = hasMilk;
    }

    @Override
    double calculatePrice() {
        if (hasMilk) {
            return price + 5000;
        } else {
            return price;
        }
    }

    @Override
    public void mix() {
    }

    @Override
    public void displayInfor() {
        System.out.printf("Ma: %d\nTen: %s\nGia: %.2f\n%s\n", id, name, price, hasMilk ? "Co sua" : "Den da");
    }
}
