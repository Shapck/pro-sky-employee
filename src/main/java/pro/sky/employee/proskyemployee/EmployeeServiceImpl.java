package pro.sky.employee.proskyemployee;

import org.springframework.stereotype.Service;
import pro.sky.employee.proskyemployee.exeptions.EmployeeAlreadyExistsException;
import pro.sky.employee.proskyemployee.exeptions.EmployeeNotFoundException;
import pro.sky.employee.proskyemployee.exeptions.TheArrayOfEmployeesIsFullException;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final Employee[] employee = new Employee[5];

    @Override
    public String addEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        for (int i = 0; i < this.employee.length; i++) {
            if (this.employee[i] != null && employee.equals(this.employee[i])) {
                throw new EmployeeAlreadyExistsException();
            }
        }
        boolean added = false;
        for (int i = 0; i < this.employee.length; i++) {
            if (this.employee[i] == null) {
                this.employee[i] = new Employee(firstName, lastName);
                added = true;
                break;
            }
        }
        if(!added){
            throw new TheArrayOfEmployeesIsFullException();
        }

        return employee.toString();
    }

    @Override
    public String deleteEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        boolean deleted = false;
        for (int i = 0; i < this.employee.length; i++) {
            if (employee.equals(this.employee[i])) {
                this.employee[i] = null;
                deleted = true;
                break;
            }
        }
        if (!deleted) {
            throw new EmployeeNotFoundException();
        }
        return employee.toString();

    }

    @Override
    public String findEmployee(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        boolean deleted = false;
        for (int i = 0; i < this.employee.length; i++) {
            if (employee.equals(this.employee[i])) {
                deleted = true;
                break;
            }
        }
        if (!deleted) {
            throw new EmployeeNotFoundException();
        }
        return employee.toString();
    }

}
