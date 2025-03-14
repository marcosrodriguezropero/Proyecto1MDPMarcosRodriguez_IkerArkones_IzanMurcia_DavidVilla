package es.uah.matcomp.mp.e1.Animal;

public class Mammal extends Animal {

    //Funciones públicas
    public Mammal(String Name) {
        super(Name);
    }

    //Salida
    public String toString() {
        return "Mammal[" + super.toString() + "]";
    }
}
