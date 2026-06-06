abstract class Employee {
    String name;
    int id;
 Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    abstract double calculateSalary();
    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + calculateSalary());
    }
}
class FullTimeEmployee extends Employee {
    double baseSalary;
    double bonus;

    FullTimeEmployee(String name, int id, double baseSalary, double bonus) {
        super(name, id);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return baseSalary + bonus;
    }
}
class PartTimeEmployee extends Employee {
    int hours;
    double rate;

    PartTimeEmployee(String name, int id, int hours, double rate) {
        super(name, id);
        this.hours = hours;
        this.rate = rate;
    }
   @Override
    double calculateSalary() {
        return hours * rate;
    }
}
public class Main {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee("John Doe", 101, 5000, 1200);
        Employee e2 = new PartTimeEmployee("Jane Smith", 102, 6, 200);
        e1.display();
        System.out.println();
        e2.display();
    }
}
