package pro.sky.employee.proskyemployee;

public interface EmployeeService {
    String addEmployee(String firstName, String lastName);
    String deleteEmployee(String firstName, String lastName);
    String findEmployee(String firstName, String lastName);

}
