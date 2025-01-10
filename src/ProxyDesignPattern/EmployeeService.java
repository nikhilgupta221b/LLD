package ProxyDesignPattern;

public interface EmployeeService {
    void createEmployee(String name);
    void deleteEmployee(int id);
    String getEmployeeById(int id);
}
