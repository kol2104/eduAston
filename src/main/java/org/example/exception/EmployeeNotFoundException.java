package org.example.exception;

public class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException(Integer id) {
        super(String.format("Employee with id = '%s' not found", id));
    }
}
