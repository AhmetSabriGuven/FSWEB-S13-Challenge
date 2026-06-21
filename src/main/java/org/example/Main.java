package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        runApplication();
    }

    public static void runApplication() {
        Healthplan healthplan = new Healthplan(1, "A Sigorta", Plan.BASIC);
        String[] healthPlans = new String[2];
        Employee employee = new Employee(1, "John Doe", "jd@test.com", "1234", healthPlans);
        employee.addHealthPlan(0, healthplan.getName());

        String[] developerNames = new String[2];
        Company company = new Company(1, "Workintech", 1000, developerNames);
        company.addEmployee(0, employee.getFullName());

        System.out.println(healthplan);
        System.out.println(employee);
        System.out.println(company);
    }
}
