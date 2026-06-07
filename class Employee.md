abstract class Employee {
    private String name;
    private int id;
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
    abstract double calculateSalary(){
    void display() {
        System.out.println("Employee Name : " + getName());
        System.out.println("Employee ID   : " + getId());
        System.out.println("Salary        : " + calculateSalary());
    }
}
class FullTimeEmployee extends Employee {
    private double baseSalary;
    private double bonus;
    FullTimeEmployee(String name, int id, double baseSalary) {
        super(name, id);
        this.baseSalary = baseSalary;
        this.bonus = 0;
    }
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
    private int hoursWorked;
    private double hourlyRate;
     PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    @Override
    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}
class Manager extends FullTimeEmployee {
    private double incentive;
     Manager(String name, int id, double baseSalary, double bonus, double incentive) {
        super(name, id, baseSalary, bonus);
        this.incentive = incentive;
    }
   @Override
    double calculateSalary() {
        return super.calculateSalary() + incentive;
    }
}
public class Main {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee("John", 101, 50000, 5000);
        Employee emp2 = new PartTimeEmployee("Jane", 102, 6, 500);
        Employee employees[] = {emp1, emp2};
          for (Employee e : employees) {
            e.display();
            System.out.println(" ");
        }
    }
}
