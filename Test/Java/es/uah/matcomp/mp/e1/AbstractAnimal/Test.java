package es.uah.matcomp.mp.e1.AbstractAnimal;

import static org.junit.jupiter.api.Assertions.*;

class Test {
    public static void main(String[] args) {
        Cat2 c1 = new Cat2("Graty");
        System.out.println("Te maullo: ");
        c1.greets();

        Dog2 d1 = new Dog2("Ricky");
        BigDog bd1 = new BigDog("Ricitos");
        System.out.println("Pues yo te ladro: ");
        d1.greets();
        System.out.println("Pues yo te ladro más duro: ");
        d1.greets(bd1);

        System.out.println("Te ladro perrito: ");
        bd1.greets(d1);
        System.out.println("Me ladro que soy un perro mu grande: ");
        bd1.greets(bd1);
    }
}