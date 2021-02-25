package com.paypal.bfs.test.employeeserv.mapper;

import com.paypal.bfs.test.employeeserv.api.model.Address;
import com.paypal.bfs.test.employeeserv.api.model.Employee;
import com.paypal.bfs.test.employeeserv.model.EmployeeTable;
import org.springframework.stereotype.Component;

@Component
public class EmployeeMapper {

  public EmployeeTable forDB(Employee employee){
    EmployeeTable employeeTable = new EmployeeTable();
    employeeTable.setFirst_name(employee.getFirstName());
    employeeTable.setLast_name(employee.getLastName());
    employeeTable.setDate_of_birth(employee.getDateOfBirth());
    employeeTable.setAddress_line1(employee.getAddress().getLine1());
    employeeTable.setAddress_line2(employee.getAddress().getLine2());
    employeeTable.setCity(employee.getAddress().getCity());
    employeeTable.setState(employee.getAddress().getState());
    employeeTable.setZip_code(employee.getAddress().getZipCode());
    employeeTable.setCountry(employee.getAddress().getCountry());
    return employeeTable;
  }

  public Employee forAPI(EmployeeTable employeeTable){
    Employee employee = new Employee();
    employee.setId(Integer.valueOf(employeeTable.getId()));
    employee.setFirstName(employeeTable.getFirst_name());
    employee.setLastName(employeeTable.getLast_name());
    employee.setDateOfBirth(employeeTable.getDate_of_birth());
    Address address = new Address();
    address.setLine1(employeeTable.getAddress_line1());
    address.setLine2(employeeTable.getAddress_line2());
    address.setCity(employeeTable.getCity());
    address.setState(employeeTable.getState());
    address.setZipCode(employeeTable.getZip_code());
    address.setCountry(employeeTable.getCountry());
    employee.setAddress(address);
    return employee;

  }

}

