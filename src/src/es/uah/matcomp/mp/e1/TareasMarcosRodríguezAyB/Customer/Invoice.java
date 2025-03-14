package es.uah.matcomp.mp.e1.Customer;
//Clase pública Invoice
public class Invoice {
    //Creamos las variables privadas
    private int id;
    private Customer customer;
    private double amount;

    //Funciones públicas
    //Creamos la función Invoice con todas las variables establecidas
    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    //Función que devuelve el valor de la variable "id"
    public int getId() {
        return id;
    }

    //Función que devuelve el valor de la variable "Customer"
    public Customer getCustomer() {
        return customer;
    }

    //Función protegida que renombra la variable "Customer" en otra
    public void setCustomer(Customer cust) {
        this.customer = cust;
    }

    //Función que devuelve el valor de la variable "Amount"
    public double getAmount() {
        return amount;
    }

    //Función que establece la variable "Amount" en otra
    public void setAmount(double amnt) {
        this.amount = amnt;
    }

    //Devuelve una variable "CustomerID" mediante las funciones "Customer" y "getID"
    public int getCustomerId() {
        return customer.getId();
    }

    //Devuelve una variable "CustomerName" mediante las funciones "Customer" y "getName"
    public String getCustomerName() {
        return customer.getName();
    }

    //Devuelve una variable "CustomerDiscount" mediante las funciones "Customer" y "getDiscount"
    public int getCustomerDiscount() {
        return customer.getDiscount();
    }

    //Retorna el valor de "amount" después de aplicar "discount"
    public double getAmountAfterDiscount() {
        return amount - (amount * customer.getDiscount()/100);
    }

    //Mostrar como se ve la salida
    public String toString() {
        return "Invoice[id=" + id + ",customer=" + customer.getName() + "(" + id + ")" + "(" + customer.getDiscount() + "%),amount=" + amount + "]";
    }
}
