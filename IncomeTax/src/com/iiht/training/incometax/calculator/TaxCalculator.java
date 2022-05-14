package com.iiht.training.incometax.calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.*;

import com.iiht.training.incometax.exception.InvalidPANException;
import com.iiht.training.incometax.exception.PANAlreadyExistsException;
import com.iiht.training.incometax.exception.PANDetailsNotProvidedException;
import com.iiht.training.incometax.exception.PANDoesNotExistsException;
import com.iiht.training.incometax.model.Deductions;
import com.iiht.training.incometax.model.Employee;
import com.iiht.training.incometax.model.TaxDetails;

public class TaxCalculator {

    public List<Employee> employees = new ArrayList<>();
    public List<Deductions> deductions = new ArrayList<>();
    public List<TaxDetails> taxDetails = new ArrayList<>();

    public boolean addEmployee(Employee employee) {
        if (panExists(employee.getPAN())) {
            throw new PANAlreadyExistsException("PAN already exists");
        }
        else if (!employee.getPAN().matches("[a-zA-Z0-9]+")) {
            throw new InvalidPANException("PAN details is invalid");
        }
        else {
            employees.add(employee);
        }
        return false;
    }

    public Double getTotalDeductions(String PAN, double sec80c, double houseRent) {
        Employee e = getEmployee(PAN);
        double basic_salary = e.getBasicSalary();

        double pf = (basic_salary * 0.12);

        double total_deductions = pf + sec80c + houseRent;

        return total_deductions;
    }

    public Double showTaxableSalary(String PAN) {
        Employee e = getEmployee(PAN);
        double gross_salary = e.getGrossSalary();
        Deductions deductions = getDeductionForEmployee(PAN);
        double total_deductions = getTotalDeductions(PAN, deductions.getSec80c(), deductions.getHouseRent());

        double taxableSalary = gross_salary - total_deductions;
        // Taxable salary = gross salary - total deductions
        return taxableSalary;
    }

    public double calculateTotalTax(String PAN) {
        Employee e = getEmployee(PAN);
        double grossSalary = e.getGrossSalary();
        double totalTax = 0.0;

        if (grossSalary > 0 && grossSalary <= 250000) {
            totalTax = 0.0;
        }
        else if (grossSalary > 250001 && grossSalary <= 500000) {
            totalTax = grossSalary * 0.05;
        }
        else if (grossSalary > 500000 && grossSalary <= 750000) {
            totalTax = (grossSalary * 0.10) + 12500;
        }
        else if (grossSalary > 750000 && grossSalary <= 1000000) {
            totalTax = (grossSalary * 0.15) + 37500;
        }
        else if (grossSalary > 1000000 && grossSalary <= 1250000) {
            totalTax = (grossSalary * 0.20) + 75000;
        }
        else if (grossSalary > 1250000 && grossSalary <= 1500000) {
            totalTax = (grossSalary * 0.25) + 125000;
        }
        else if (grossSalary > 1500000) {
            totalTax = (grossSalary * 0.30) + 187500;
        }

        double netSalary = showTaxableSalary(PAN);

        // calculate total tax and add to TaxDetails List
        taxDetails.add(new TaxDetails(e.getId(), e.getPAN(), e.getGrossSalary(), netSalary, totalTax));
        return totalTax;
    }

    public List<TaxDetails> getTaxDetails() {
        return taxDetails;
    }

    private Deductions getDeductionForEmployee(String PAN) {
        for (Deductions deduction : deductions) {
            if (deduction.getPAN().equalsIgnoreCase(PAN)) {
                return deduction;
            }
        }
        return null;
    }

    private Employee getEmployee(String PAN) {
        for (Employee emp : employees) {
            if (emp.getPAN().equalsIgnoreCase(PAN)) {
                return emp;
            }
        }
        throw new PANDoesNotExistsException("PAN Does not Exists");
    }

    private boolean panExists(String pan) {
        for (Employee emp : employees) {
            if (emp.getPAN().equalsIgnoreCase(pan)) {
                return true;
            }
        }
        return false;
    }

}
