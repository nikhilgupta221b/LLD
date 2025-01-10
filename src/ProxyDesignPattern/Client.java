package ProxyDesignPattern;

public class Client {
    public static void main(String[] args) {

        System.out.println("Admin Role:");

        EmployeeService adminService = new EmployeeServiceProxy("admin");
        adminService.createEmployee("John Doe");
        adminService.createEmployee("Jane Smith");

        System.out.println(adminService.getEmployeeById(1));

        adminService.deleteEmployee(1);

        System.out.println(adminService.getEmployeeById(1));

        System.out.println("\nUser Role:");

        EmployeeService userService = new EmployeeServiceProxy("user");
        userService.createEmployee("Tom Brown");  // This should be denied

        System.out.println(userService.getEmployeeById(2));

        userService.deleteEmployee(2);  // This should be denied
    }
}