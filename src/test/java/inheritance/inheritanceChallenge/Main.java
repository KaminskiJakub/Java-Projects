package inheritance.inheritanceChallenge;

public class Main {
    public static void main(String[] args) {

        Employee alex = new Employee("Alex", "11/11/2000", "05/08/2020");
        System.out.println(alex);
        System.out.println("Age " + alex.getAge());
        System.out.println("Pay " + alex.collectPay());

        Employee martin = new Employee("Martin", "05/06/1997", "05/08/2020");
        System.out.println(martin);

        SalariedEmployee roman = new SalariedEmployee("Roman", "09/09/1980", "02/02/2022", 60000);
        System.out.println(roman);
        System.out.println("Roman Paycheck is " + roman.collectPay() + " $");
        roman.retire();
        System.out.println("Roman Paycheck is " + roman.collectPay() + " $");

        HourlyEmployee catrin = new HourlyEmployee("Catrin", "07/09/1990", "04/04/2010", 20);
        System.out.println(catrin);
        System.out.println("Catrin Paycheck is " + catrin.collectPay() + " $");
        System.out.println("Catrin Holiday Paycheck is " + catrin.getDoublePay() + " $");
    }
}
