package es.uah.matcomp.mp.e1.Person;

import static org.junit.jupiter.api.Assertions.*;

class Test {
    public static void main(String[] args) {
        Student s1 = new Student("Joseba Cilarte", "joseba@cilarte.com","Laboratorio",1999,1330);
        System.out.println(s1);

        Staff st1 = new Staff("Elton Yon","elton@yon.com","Antonio Indaleciano",1500);
        System.out.println(st1);

        s1.setYear(2002);
        s1.setFee(1600);
        System.out.println("Tras unas modificaciones con el contrato de Joseba...");
        System.out.println(s1);

        st1.setPay(1250);
        System.out.println("Tras unas modificaciones con el contrato de Elton...");
        System.out.println(st1);
    }
}