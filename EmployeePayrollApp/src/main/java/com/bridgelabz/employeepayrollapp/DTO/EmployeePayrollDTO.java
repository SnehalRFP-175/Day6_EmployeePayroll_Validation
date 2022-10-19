package com.bridgelabz.employeepayrollapp.DTO;


import lombok.AllArgsConstructor;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;



@AllArgsConstructor
public class EmployeePayrollDTO {


    @NotEmpty(message = "Employee name cannot be empty")
    @Pattern(regexp = "^[A-Z][a-zA-Z\\s]{2,}$", message = "Employee name Invalid")
    public String name;
    @Min(value=100 , message = "The Salary Should be more than 100")
    public long salary;

    @Override
    public String toString() {
        return "name = "+name +" salary = " + salary;
    }
}
