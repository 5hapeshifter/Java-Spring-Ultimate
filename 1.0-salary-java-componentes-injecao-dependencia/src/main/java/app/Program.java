package app;

import entities.Employee;
import services.BrasilTaxService;
import services.PensionService;
import services.SalaryService;
import services.TaxService;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome: ");
        String name = sc.nextLine();
        System.out.println("Salario Bruto: ");
        double grossSalary = sc.nextDouble();

        Employee employee = new Employee(name, grossSalary);

        //TaxService taxService = new TaxService();
        TaxService taxService = new BrasilTaxService();
        PensionService pensionService = new PensionService();
        SalaryService salaryService = new SalaryService(taxService, pensionService);

        double netSalary = salaryService.netSalary(employee);
        System.out.printf("Salario Bruto: %.2f%n", netSalary);

        sc.close();
    }
}
