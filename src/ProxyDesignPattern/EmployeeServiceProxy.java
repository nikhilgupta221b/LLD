package ProxyDesignPattern;

public class EmployeeServiceProxy implements EmployeeService {
    private EmployeeServiceImpl realService;
    private String role;

    public EmployeeServiceProxy(String role) {
        this.role = role;
        this.realService = new EmployeeServiceImpl();
    }

    @Override
    public void createEmployee(String name) {
        if (role.equalsIgnoreCase("admin")) {
            realService.createEmployee(name);
        } else {
            System.out.println("Access Denied: Only admin can create employees.");
        }
    }

    @Override
    public void deleteEmployee(int id) {
        if (role.equalsIgnoreCase("admin")) {
            realService.deleteEmployee(id);
        } else {
            System.out.println("Access Denied: Only admin can delete employees.");
        }
    }

    @Override
    public String getEmployeeById(int id) {
        // Both admin and user roles can access this
        return realService.getEmployeeById(id);
    }
}