
//----------PART A---------------
import java.util.*;

class Employee {
        String name;
        int age;
        double salary;

        Employee(String name, int age, double salary) {
                this.name = name;
                this.age = age;
                this.salary = salary;
        }

        @Override
        public String toString() {
                return String.format("Employee{name='%s', age=%d, salary=%.2f}", name, age, salary);
        }
}

public class EmployeeSorting {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                List<Employee> employees = new ArrayList<>();

                System.out.print("Enter number of employees: ");
                int n = sc.nextInt();
                sc.nextLine(); // consume newline

                for (int i = 0; i < n; i++) {
                        System.out.println("Enter employee " + (i + 1) + " details:");
                        System.out.print("Name: ");
                        String name = sc.nextLine();
                        System.out.print("Age: ");
                        int age = sc.nextInt();
                        System.out.print("Salary: ");
                        double salary = sc.nextDouble();
                        sc.nextLine(); // consume newline
                        employees.add(new Employee(name, age, salary));
                }

                System.out.println("\nSort by:");
                System.out.println("1. Name (Alphabetically)");
                System.out.println("2. Age (Ascending)");
                System.out.println("3. Salary (Descending)");
                System.out.print("Choose an option: ");
                int choice = sc.nextInt();

                switch (choice) {
                        case 1:
                                employees.sort((e1, e2) -> e1.name.compareToIgnoreCase(e2.name));
                                break;
                        case 2:
                                employees.sort(Comparator.comparingInt(e -> e.age));
                                break;
                        case 3:
                                employees.sort((e1, e2) -> Double.compare(e2.salary, e1.salary));
                                break;
                        default:
                                System.out.println("Invalid choice");
                                return;
                }

                System.out.println("\nSorted Employees:");
                employees.forEach(System.out::println);
        }
}

/*
 * Enter number of employees: 3
 * Enter employee 1 details:
 * Name: Alice
 * Age: 30
 * Salary: 50000
 * Enter employee 2 details:
 * Name: Bob
 * Age: 25
 * Salary: 60000
 * Enter employee 3 details:
 * Name: Charlie
 * Age: 35
 * Salary: 55000
 * 
 * Sort by:
 * 1. Name (Alphabetically)
 * 2. Age (Ascending)
 * 3. Salary (Descending)
 * Choose an option: 1
 * 
 */
