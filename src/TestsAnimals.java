public class TestsAnimals {
    public static void main(String[] args) {
        Animal a1 = new Dog("Buddy");
        Animal a2 = new Cat("Kitty");
        Dog d1 = new Dog("Rex");
        Dog d2 = new BigDog("Bruno");
        BigDog bd1 = new BigDog("Max");

        a1.greets(); // Woof!
        a2.greets(); // Meow!
        d1.greets(); // Woof!
        d1.greets(d1); // Woooof!
        d2.greets(); // WOOF!
        d2.greets(d1); // WOOOOF!
        bd1.greets(); // WOOF!
        bd1.greets(d1); // WOOOOF!
        bd1.greets(bd1); // WOOOOOOF!
    }
}
