package com.iiht.training.incometax;

import com.iiht.training.incometax.calculator.TaxCalculator;
import com.iiht.training.incometax.model.Deductions;
import com.iiht.training.incometax.model.Employee;
import com.iiht.training.incometax.model.TaxDetails;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TaxCalculator calculator = new TaxCalculator();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter employee id :- ");
            Long id = scanner.nextLong();
            System.out.print("Enter employee name :- ");
            String name = scanner.next();
            System.out.print("Enter PAN details :- ");
            String PAN = scanner.next();
            System.out.print("Enter age of the employee :- ");
            int age = scanner.nextInt();
            System.out.print("Enter email of employee :- ");
            String email = scanner.next();
            System.out.print("Enter the basic salary :- ");
            double basicSalary = scanner.nextDouble();
            System.out.print("Enter the basic salary :- ");
            double grossSalary = scanner.nextDouble();
            double pf = (basicSalary * 0.12);
            System.out.print("Enter sec80c for employee :- ");
            double sec80c = scanner.nextDouble();
            System.out.print("Ener house rent of the employee :- ");
            double houseRent = scanner.nextDouble();
            Deductions deductions = new Deductions(PAN, pf, sec80c, houseRent);
            calculator.deductions.add(deductions);
            Employee employee = new Employee(id, name, PAN, age, email, basicSalary, grossSalary);
            calculator.addEmployee(employee);
            calculator.calculateTotalTax(PAN);
        }

        List<TaxDetails> res = calculator.getTaxDetails();

        for (TaxDetails item : res) {
            System.out.println(item.toString());
        }
    }
}
