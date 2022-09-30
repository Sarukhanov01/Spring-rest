package com.company.spring.rest;

import com.company.spring.rest.configuration.MyConfig;
import com.company.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication",Communication.class);
//        List<Employee> allEmployees = communication.getAllEmployees();
//        System.out.println(allEmployees);

//        Employee employee = communication.getEmployee(1);
//        System.out.println(employee);

//        Employee employee = new Employee("Sveta","Sokolova","IT",1200);
//        employee.setId(14);
//        communication.saveEmployee(employee);

        communication.deleteEmployee(14);
    }
}
