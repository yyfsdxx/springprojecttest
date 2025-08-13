package org.yyf.service;

import org.yyf.dto.EmployeeDTO;
import org.yyf.dto.EmployeeLoginDTO;
import org.yyf.entity.Employee;

public interface EmployeeService {

    /**
     * 员工登录
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);
    /**
     * 新增员工
     * @param employeeDTO
     * @return
     */
   public void save(EmployeeDTO employeeDTO);
}
