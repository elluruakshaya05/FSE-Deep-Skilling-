package com.cognizant.ormlearn.comparison.hibernate;

import com.cognizant.ormlearn.model.Employee;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class HibernateEmployeeExample {

    private static SessionFactory factory;

    public static void addEmployee() {
        factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            Employee emp = new Employee();
            emp.setName("John Doe");
            emp.setDepartment("Tech");
            emp.setSalary(80000);
            session.save(emp);
            tx.commit();
            System.out.println("Hibernate: Employee inserted => " + emp);
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
            factory.close();
        }
    }
}
