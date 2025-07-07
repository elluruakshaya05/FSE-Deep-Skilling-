package com.cognizant.ormlearn;

import com.cognizant.ormlearn.comparison.hibernate.HibernateEmployeeExample;
import com.cognizant.ormlearn.model.Employee;
import com.cognizant.ormlearn.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class OrmLearnApplication {

    private static EmployeeService employeeService;

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
        employeeService = context.getBean(EmployeeService.class);

        // Spring Data JPA
        Employee emp = new Employee();
        emp.setName("Jane Smith");
        emp.setDepartment("HR");
        emp.setSalary(70000);
        employeeService.addEmployee(emp);
        System.out.println("Spring Data JPA: Employee inserted => " + emp);

        // Hibernate (classic)
        HibernateEmployeeExample.addEmployee();
    }
}
