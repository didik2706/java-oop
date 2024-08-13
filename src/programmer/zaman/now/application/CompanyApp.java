package programmer.zaman.now.application;

import programmer.zaman.now.data.Company;

public class CompanyApp {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("Programmer Zaman Now");

        Company.Employee employee = company.new Employee();
        employee.setName("Didik");
        System.out.println(employee.getCompany());
        System.out.println(employee.getName());

        Company company2 = new Company();
        company2.setName("Delman");

        Company.Employee employee2 = company2.new Employee();
        employee2.setName("Zainal");
        System.out.println(employee2.getCompany());
        System.out.println(employee2.getName());
    }
}
