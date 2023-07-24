package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if (salary < 0) {
            System.out.println("wrong input!");
        } else if (salary <= 10000) {
            double tax = 0.15;
            double salaryAfterTax = salary - (salary * tax);
            System.out.println(salaryAfterTax);
        } else if (salary <= 20000) {
            double tax = 0.18;
            double salaryAfterTax = salary - (salary * tax);
            System.out.println(salaryAfterTax);
        } else {
            double tax = 0.2;
            double salaryAfterTax = salary - (salary * tax);
            System.out.println(salaryAfterTax);
    }
}
}

