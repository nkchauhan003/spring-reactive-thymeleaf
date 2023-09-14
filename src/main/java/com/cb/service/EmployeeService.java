package com.cb.service;

import com.cb.model.Employee;
import reactor.core.publisher.Flux;

public interface EmployeeService {
    public Flux<Employee> getEmployees();
}
