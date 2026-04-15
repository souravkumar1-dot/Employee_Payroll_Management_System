class Employee {
    String name;
    int id;
    double salary;

    // Constructor
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Method to calculate salary using if
    void calculateSalary(String type, double baseSalary, double bonus, int hours, double rate) {

        if (type.equals("fulltime")) {
            salary = baseSalary + bonus;
        } 
        else if (type.equals("parttime")) {
            salary = hours * rate;
        } 
        else {
            salary = 0;
        }
    }

    // Display details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

public class PayrollSystem {
    public static void main(String[] args) {

        // Full-time employee
        Employee e1 = new Employee("Rahul", 101);
        e1.calculateSalary("fulltime", 40000, 10000, 0, 0);
        e1.display();

        System.out.println();

        // Part-time employee
        Employee e2 = new Employee("Amit", 102);
        e2.calculateSalary("parttime", 0, 0, 60, 200);
        e2.display();
    }
}