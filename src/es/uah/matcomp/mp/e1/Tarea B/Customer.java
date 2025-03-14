public class Customer {
    private int id;
    private String name;
    private int discount; // Asegurar que este atributo está presente

    public Customer(int id, String name, int discount) {
        this.id = id;
        this.name = name;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDiscount() { // Este método debe existir
        return discount;
    }

    public void setDiscount(int discount) { // Este método debe existir
        this.discount = discount;
    }

    @Override
    public String toString() {
        return name + "(" + id + ")(" + discount + "%)";
    }
}