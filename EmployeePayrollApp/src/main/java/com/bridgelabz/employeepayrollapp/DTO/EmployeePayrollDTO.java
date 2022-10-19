package com.bridgelabz.employeepayrollapp.DTO;


import lombok.AllArgsConstructor;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;



@AllArgsConstructor
public class EmployeePayrollDTO {


    @Pattern(regexp = "^[A-z]{1}[a-zA-z\\s]{2,}$",message = "Invalid Name....!")
    @NotEmpty(message = "Employee Cannot Be Null....!")
    public String name;

    @Min(value=100 , message = "The Salary Should be more than 100")
    public long salary;

    @Override
    public String toString() {
        return "name = "+name +" salary = " + salary;
    }
}
