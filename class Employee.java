public class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void calculateSalary(String type, double baseSalary, double bonus, int hours, double rate) {

        if ("fulltime".equalsIgnoreCase(type)) {
            salary = baseSalary + bonus;
        } 
        else if ("parttime".equalsIgnoreCase(type)) {
            salary = hours * rate;
        } 
        else {
            salary = 0;
            System.out.println("Invalid employee type");
        }
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }

    
    public static void main(String[] args) {

        Employee e1 = new Employee("John Doe", 101);
        e1.calculateSalary("fulltime", 5000, 1200, 0, 0);
        e1.display();

        System.out.println();

        Employee e2 = new Employee("Jane Smith", 102);
        e2.calculateSalary("parttime", 0, 0, 6, 200);
        e2.display();
    }
}
