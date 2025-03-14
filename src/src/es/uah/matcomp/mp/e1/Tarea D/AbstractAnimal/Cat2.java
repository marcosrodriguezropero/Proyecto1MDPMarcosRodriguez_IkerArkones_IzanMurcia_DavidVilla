package es.uah.matcomp.mp.e1.AbstractAnimal;

public class Cat2 extends Animal2 {
    //Métodos públicos
    public Cat2(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Meow");
    }
}
