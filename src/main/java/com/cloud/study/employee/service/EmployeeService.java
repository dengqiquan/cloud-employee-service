package com.cloud.study.employee.service;

import com.cloud.study.employee.domain.EmployeeDto;
import com.cloud.study.employee.domain.EmployeeSearch;
import com.cloud.study.employee.entity.Employee;
import java.util.List;
/**
*  generated by AddClassPlugin plugin
*/

public interface EmployeeService {
        /**
        * 新增
        * @param employeeDto
        */
        void addEmployee(EmployeeDto employeeDto);
        /**
        * 修改(删除)
        * @param employeeDto
        * @param employeeSearch
        */
        void updateByEmployeeSearch(EmployeeDto employeeDto, EmployeeSearch employeeSearch);
        /**
        * 根据id查询
        * @param id
        * @return
        */
        EmployeeDto findById(Integer id);
        /**
        * 分页list
        * @param employeeSearch
        * @return
        */
        List<EmployeeDto> searchByEmployeeSearch(EmployeeSearch employeeSearch);
        /**
        * 分页条数
        * @param employeeSearch
        * @return
        */
        Long count(EmployeeSearch employeeSearch);
}