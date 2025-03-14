package es.uah.matcomp.mp.e1.AbstractAnimal;

import es.uah.matcomp.mp.e1.Animal.Animal;
import es.uah.matcomp.mp.e1.Animal.Dog;

public class BigDog extends Dog2 {
    //Métodos públicos
    public BigDog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Woow");
    }

    @Override
    public void greets(Dog2 another) {
        System.out.println("Woooooow");
    }


    public void greets(BigDog another) {
        System.out.println("Woooooooow");
    }
}
