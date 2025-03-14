package es.uah.matcomp.mp.e1.Animal;

public class Cat extends Mammal{

    //Funciones públicas
    public Cat(String name){
        super(name);
    }

    public void greets() {
        System.out.println("Meow");
    }

    //Salida
    public String toString(){
        return "Cat[" + super.toString() + "]";
    }


}
