package es.uah.matcomp.mp.e1.Animal;

public class Dog extends Mammal{

    //Funciones públicas
    public Dog(String name) {
        super(name);
    }

   //Ladridos
    public void greets() {
        System.out.println("Woof");
    }

    public void greets(Dog another) {
        System.out.println("Woooooof");
    }

    //Salida
    public String toString() {
        return "Dog[" + super.toString() + "]";
    }


}
