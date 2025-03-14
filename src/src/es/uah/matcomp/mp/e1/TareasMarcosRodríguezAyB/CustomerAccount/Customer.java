package es.uah.matcomp.mp.e1.CustomerAccount;
//Clase pública Customer
public class Customer {
    //Creamos las variables privadas
    private int id;
    private String name;
    private char gender;

    //Funciones públicas
    //Función "Customer" que define todas las variables
    public Customer(int id, String name, char gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    //Función que devuelve el valor de la variable "id"
    public int getId() {
        return id;
    }

    //Función que devuelve el valor de la variable "name"
    public String getName() {
        return name;
    }

    //Función que devuelve el valor de la variable "gender"
    public char getGender() {
        return gender;
    }

    //Cómo aparece la salida
    public String toString() {
        return name + "(" + id + ")";
    }
}
