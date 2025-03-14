package es.uah.matcomp.mp.e1.CustomerAccount;

import static org.junit.jupiter.api.Assertions.*;

class Test {
    public static void main(String[] args) {
        Customer c = new Customer(165, "Manolo", 'M');
        Account acc1 = new Account(332, c, 300.00);
        Account acc2 = new Account(107, c);

        System.out.println(acc1);
        System.out.println(acc2);

        //Operaciones con la primera cuenta
        acc1.deposit(200);
        System.out.println("After deposit: " + acc1);

        acc1.withdraw(100);
        System.out.println("After withdrawal: " + acc1);

        acc1.withdraw(700);
        System.out.println("After over-withdrawal attempt: " + acc1);

        //Operaciones con la segunda cuenta
        acc2.deposit(150);
        System.out.println("After deposit: " + acc2);

        acc2.withdraw(310);
        System.out.println("After withdrawal: " + acc2);

        acc2.withdraw(640);
        System.out.println("After over-withdrawal attempt: " + acc2);
    }
}