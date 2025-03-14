package es.uah.matcomp.mp.e1.Employee;

public class Employee {
    //Variables privadas con sus correspondientes atributos
    private int id;
    private String firstName;
    private String lastName;
    private int Salary;

    //Funciones públicas
    //Función empleado con todas sus variables
    public Employee(int id, String firstName, String lastName, int Salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.Salary = Salary;
    }

    //Función para devolver el valor de "id"
    public int getId() {
        return id;
    }

    //Función para determinar el valor de "FirstName"
    public String getfirstName() {
        return firstName;
    }

    //Función para determinar el valor de "LastName"
    public String getlastName() {
        return lastName;
    }

    //Función para devolver el valor conjunto de "FirstName" y "LastName"
    public String getName() {
        return firstName + " " + lastName;
    }

    //Función para determinar el valor de "Salary"
    public int getSalary() {
        return Salary;
    }

    //Función para determinar el valor "Salary" a "S"
    public void setSalary(int S) {
        this.Salary = S;
    }

    //Función para devolver el valor del Salario Anual
    public int getAnnualSalary() {
        return Salary * 12;
    }

    //Función para incrementar el salario un porcentaje
    public int raiseSalary(int Percentage) {
        return Salary + Salary * Percentage;
    }

    //Función para escribir los valores correspondientes a cada variable
    public String toString() {
        return "Employee[id=" + id + ",name=" + firstName + " " + lastName + ",salary=" + Salary + "]";
    }
}

