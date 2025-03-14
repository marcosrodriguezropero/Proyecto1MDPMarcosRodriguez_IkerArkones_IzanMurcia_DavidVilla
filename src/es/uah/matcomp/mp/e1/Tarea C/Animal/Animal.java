package es.uah.matcomp.mp.e1.Animal;

public class Animal {
    //Variables privadas
    private String name;

    //Funciones públicas
    public Animal(String name) {
        this.name = name;
    }

    //Salida
    public String toString() {
        return "Animal[name=" + name + "]";
    }
}
