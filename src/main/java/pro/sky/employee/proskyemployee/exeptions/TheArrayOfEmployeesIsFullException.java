package pro.sky.employee.proskyemployee.exeptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR,reason = "Массив сотрудников переполнен")
public class TheArrayOfEmployeesIsFullException extends RuntimeException{
}
