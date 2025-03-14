package es.uah.matcomp.mp.e1.Person;

public class Staff extends Person {
    //Variables privadas
    private String school;
    private double pay;

    //Funciones públicas para establecer las variables
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    //Devolver y establecer la variable "school"
    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    //Devolver y establecer la variable "pay"
    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    //Salida
    @Override
    public String toString() {
        return "Staff[" + super.toString() + ",school=" + school + ",pay=" + pay + "]";
    }
}

