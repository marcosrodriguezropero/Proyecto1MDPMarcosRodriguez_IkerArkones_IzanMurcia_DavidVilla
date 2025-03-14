package es.uah.matcomp.mp.e1.Person;

public class Student extends Person {
    private String Program;
    private int year;
    private double fee;

    public Student(String name, String address, String Program, int year, double fee) {
        super(name, address);
        this.Program = Program;
        this.year = year;
        this.fee = fee;
    }

    //Devolver y establecer el valor de la variable "Program"
    public String getProgram() {
        return Program;
    }

    public void setProgram(String program) {
        this.Program = program;
    }

    //Devolver y establecer el valor de la variable "Year"
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //Devolver y establecer el valor de la variable "fee"
    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    //Salida
    @Override
    public String toString() {
        return "Student[" + super.toString() +  ",program= " + Program + ",year=" + year + ",fee=" + fee + "]";
    }
}
