package pro.sky.employee.proskyemployee.exeptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND,reason = "Сотрудник не найден")
public class EmployeeNotFoundException extends RuntimeException{
}
