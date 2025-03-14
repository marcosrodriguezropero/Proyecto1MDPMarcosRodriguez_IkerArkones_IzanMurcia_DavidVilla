package es.uah.matcomp.mp.e1.Animal;

public class TestMain19 {
    public static void main(String[] args) {

        Animal a1 = new Animal("Josete");
        System.out.println("Animal: " + a1);

        Animal a2 = new Mammal("Juan");
        System.out.println("Mammal: " + a2);

        Cat a3 = new Cat("Fulgencio");
        System.out.println("Cat: " + a3);
        a3.greets();

        Dog a4 = new Dog("Rasky");
        System.out.println("Dog: " + a4);
        a4.greets();

        System.out.println("Rasky también puede hacer esto...");
        a4.greets(a4);
    }
}
