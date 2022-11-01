package taskHome221010;

public class SergeiEmployee {
    protected float taxRate;
    protected float socialRate;
    protected float salary;
    public float calculateTax;
    protected String name;
    protected String surName;

    public float getCalculateTax() {
        return (salary * taxRate) + (salary * socialRate);
    }

    public static void main(String[] args) {
        ContractorS sergeyIvanov = new ContractorS("Sergey", "Ivanov", 3000.23f);
        RezidentEmployeeS robertPattison = new RezidentEmployeeS("Robert", "Pattison", 344200f);
        NoRezidentEmployeeS mikhailJava = new NoRezidentEmployeeS("Mikhail", "Java", 5000f);

        System.out.println("Tax for Sergey: " + sergeyIvanov.getCalculateTax());
        System.out.println("Tax for Robert: " + robertPattison.getCalculateTax());
        System.out.println("Tax for Mikhail: " + mikhailJava.getCalculateTax());
    }
}

class NoRezidentEmployeeS extends SergeiEmployee{
    public NoRezidentEmployeeS(String name,String surName, float salary) {
        this.taxRate = 0.2f;
        this.socialRate = 0.03f;
        this.salary = salary;
        this.name = name;
        this.surName = surName;
//        this.calculateTax = ((salary * taxRate) + (salary * socialRate));
    }
}

class RezidentEmployeeS extends SergeiEmployee{
    public RezidentEmployeeS(String name,String surName, float salary) {
        this.taxRate = 0.15f;
        this.socialRate = 0.1f;
        this.salary = salary;
        this.name = name;
        this.surName = surName;
//        this.calculateTax = ((salary * taxRate) + (salary * socialRate));
    }

}

class ContractorS extends SergeiEmployee{
    public ContractorS(String name,String surName, float salary) {
        this.taxRate = 0;
        this.socialRate = 0;
        this.salary = salary;
        this.name = name;
        this.surName = surName;
        this.calculateTax = 0;
    }
}