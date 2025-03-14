package es.uah.matcomp.mp.e1.AbstractAnimal;

public class Dog2 extends Animal2 {
    //Métodos públicos
    public Dog2 (String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Woof");
    }


    public void greets(Dog2 another) {
        System.out.println("Wooooooof");
    }
}
