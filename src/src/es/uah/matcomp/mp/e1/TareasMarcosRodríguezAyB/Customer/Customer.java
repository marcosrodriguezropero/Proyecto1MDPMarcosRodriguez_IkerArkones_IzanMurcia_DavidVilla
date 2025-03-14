package es.uah.matcomp.mp.e1.Customer;
//Clase pública Customer
public class Customer {
    //Creamos las variables privadas
    private int id;
    private String name;
    private int discount;

    //Funciones públicas
    //Función cliente que define todas las variables
    public Customer(int id, String name, int discount) {
        this.id = id;
        this.name = name;
        this.discount = discount;
    }

    //Función que devuelve la variable "id"
    public int getId() {
        return id;
    }

    //Función que devuelve la variable "name"
    public String getName() {
        return name;
    }

    //Función que devuelve la variable "Discount"
    public int getDiscount() {
        return discount;
    }

    //Función protegida que establece la variable "discount" en otra
    public void setDiscount(int disc) {
        this.discount = disc;
    }

    //Función que determina como aparece la salida
    public String toString() {
        return name + "(" + id + ")" + "(" + discount + "%)";
    }
}
