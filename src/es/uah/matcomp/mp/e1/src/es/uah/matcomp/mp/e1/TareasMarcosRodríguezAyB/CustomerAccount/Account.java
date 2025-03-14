package es.uah.matcomp.mp.e1.CustomerAccount;
//Clase pública Account
public class Account {
    //Creamos las variables privadas
    private int id;
    private Customer customer;
    private double balance = 0.0;

    //Funciones públicas
    //Función Account1 que define todas las variables menos uno
    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }

    //Función Account2 que define todas las variables
    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    //
    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Amount withdrawn exceeds the current balance!");
        }
    }

    public String getCustomerName() {
        return customer.getName();
    }

    @Override
    public String toString() {
        return customer.toString() + " balance=$" + String.format("%.2f", balance);
    }
}
