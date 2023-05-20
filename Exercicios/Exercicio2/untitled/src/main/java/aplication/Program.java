package aplication;

import entities.EmployeeSalary;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        EmployeeSalary employeeSalary = new EmployeeSalary();
        System.out.print("Name: ");
        employeeSalary.name = sc.nextLine();
        System.out.print("Gross Salary: ");
        employeeSalary.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employeeSalary.tax = sc.nextDouble();

        System.out.printf("Employee and salary: " + employeeSalary.name + ", $ %.2f", employeeSalary.IncreaseSalary());

        System.out.printf("%nPercenter: ");
        double percenter = sc.nextDouble();
        employeeSalary.AddPercenter(percenter);

        System.out.printf("Employee e new salary: " + employeeSalary.name + ", $ %.2f", employeeSalary.NewSalary());



    }
}
