import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagementSystem {
    private static ArrayList<Employee> employees = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            //Menu
            System.out.println("\n--- Employee Management System  ---");
            System.out.println("1.Add Employee");
            System.out.println("2.View All Employees");
            System.out.println("3.Search Employee by ID");
            System.out.println("4.Update Employee Department");
            System.out.println("5.Delete Employee");
            System.out.println("6.Exit");
            System.out.print("Enter Your Choice:");
            choice = sc.nextInt();
            sc.nextLine();  //Consume newline


            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    viewEmployees();
                    break;
                case 3:
                    searchEmployee();
                    break;
                case 4:
                    updateDepartment();
                    break;
                case 5:
                    deleteEmployee();
                case 6:
                    System.out.println("Exiting The Program");
                    break;
                default:
                    System.out.println("Invalid choice. Enter 1 to 6.");
                    break;

            }
        } while (choice != 6);
    }

    //Add Employee
    private static void addEmployee() {
        System.out.print("Enter ID:");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name:");
        String name = sc.nextLine();
        System.out.print("Enter Department:");
        String department = sc.nextLine();

        Employee emp = new Employee(id, name, department);
        employees.add(emp);
        System.out.println("Employee added Successfully!");
    }

    //View Employees
    private static void viewEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
        } else {
            for (Employee emp : employees) {
                System.out.print(emp);
            }
        }
    }

    //Search Employee
    private static void searchEmployee() {
        System.out.print("Enter ID to search:");
        int id = sc.nextInt();
        sc.nextLine();

        for (Employee emp : employees) {
            if (emp.getID() == id) {
                System.out.print("Employee found:" + emp);
                return;
            }
        }
        System.out.println("Employee not found.");
    }


    //Update Department
    private static void updateDepartment() {
        System.out.print("Enter ID to update:");
        int id = sc.nextInt();
        sc.nextLine();

        for (Employee emp : employees) {
            if (emp.getID() == id) {
                System.out.print("Enter new Department:");
                String newDept = sc.nextLine();
                emp.setDepartment(newDept);
                System.out.println("Department updated successfully");
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    //Delete Employee
    private static void deleteEmployee() {
        System.out.print("Enter ID to delete:");
        int id = sc.nextInt();
        sc.nextLine();

        for (Employee emp : employees) {
            if (emp.getID() == id) {
                employees.remove(emp);
                System.out.println("Employees deleted successfully");
                return;
            }
        }
        System.out.println("Employee not found.");
    }
}


















