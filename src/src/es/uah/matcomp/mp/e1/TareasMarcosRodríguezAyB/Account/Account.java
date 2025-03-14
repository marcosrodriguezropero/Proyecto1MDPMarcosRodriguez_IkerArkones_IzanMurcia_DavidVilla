package es.uah.matcomp.mp.e1.Account;
//Creamos la clase "Account"
public class Account {
    //Creamos las variables privadas
    private String id;
    private String name;
    private int balance;

    //Funciones Públicas
    //Creamos las función pública con todas las variables de la primera cuenta
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    //Creamos la función pública con todas las variables para la segunda cuenta
    public Account(String id, String name, int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    //Función que devuelve el valor de la id
    public String getId() {
        return id;
    }

    //Función que devuelve el valor del nombre
    public String getName() {
        return name;
    }

    //Función que establece el valor de la Id a otro nombre
    public int getBalance() {
        return balance;
    }

    //Función que devuelve el valor del crédito con la suma de "balance" y el valor introducido
    public int credit(int amount) {
        balance += amount;
        return balance;
    }

    //Función que devuelve el valor del débito con la resta de "balance" y el valor introducido
    public int debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    //Fúnción para transferir de una cuenta a otra
    public int transferTo(Account another, int amount) {
        if (amount <= balance) {
            this.balance -= amount;
            another.credit(amount);
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    //Función para mostrar la salida del programa
    public String toString() {
        return "Account{id=" + id + ", name=" + name + ", balance=" + balance + "}";
    }

}

