package ProxyDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class EmployeeServiceImpl implements EmployeeService {
    private Map<Integer, String> employeeDatabase = new HashMap<>();
    private int currentId = 1;

    @Override
    public void createEmployee(String name) {
        employeeDatabase.put(currentId, name);
        System.out.println("Employee created: ID = " + currentId + ", Name = " + name);
        currentId++;
    }

    @Override
    public void deleteEmployee(int id) {
        if (employeeDatabase.containsKey(id)) {
            employeeDatabase.remove(id);
            System.out.println("Employee with ID " + id + " deleted.");
        } else {
            System.out.println("Employee with ID " + id + " not found.");
        }
    }

    @Override
    public String getEmployeeById(int id) {
        return employeeDatabase.getOrDefault(id, "Employee not found");
    }
}
