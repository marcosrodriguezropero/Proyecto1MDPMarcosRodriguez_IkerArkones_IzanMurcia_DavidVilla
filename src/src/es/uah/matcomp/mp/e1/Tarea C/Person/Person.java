package es.uah.matcomp.mp.e1.Person;

public class Person {
    //Variables privadas
    private String name;
    private String address;

    //Establecer las variables
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    //Devolver y establecer la variable "address"
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //Salida
    @Override
    public String toString() {
        return "Person[name=" + name + ",address=" + address + "]";
    }
}

