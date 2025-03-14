public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    // Constructor
    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    // Getter para ID
    public int getId() {
        return id;
    }

    // Getter para FirstName
    public String getFirstName() {
        return firstName;
    }

    // Getter para LastName
    public String getLastName() {
        return lastName;
    }

    // Getter para Name (concatenación de FirstName y LastName)
    public String getName() {
        return firstName + " " + lastName;
    }

    // Getter para Salary
    public int getSalary() {
        return salary;
    }

    // Setter para Salary
    public void setSalary(int salary) {
        this.salary = salary;
    }

    // Método para obtener el salario anual
    public int getAnnualSalary() {
        return salary * 12;
    }

    // Método para aumentar el salario en un porcentaje
    public int raiseSalary(int percent) {
        this.salary += (salary * percent) / 100;
        return this.salary;
    }

    // Método toString()
    @Override
    public String toString() {
        return "Employee[id=" + id + ",name=" + getName() + ",salary=" + salary + "]";
    }
}
