package entities;

public class EmployeeSalary {

    public String name;

    public double grossSalary;

    public double tax;

    public double percenter;

    public double IncreaseSalary(){
        return grossSalary - tax;
    }

    public void AddPercenter(double percenter) {
        this.percenter = grossSalary * percenter  / 100;
    }

    public double NewSalary(){
        return IncreaseSalary() + percenter;
    }
}
