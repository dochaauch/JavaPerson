package taskHome221010;

public class Employee {
    String name;
    String surname;
    private static String taxRate;
    private static String socialRate;
    private static double salary;

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public static double CalculateTax(double salary, String taxRate, String socialRate) {
        int tR = Integer.parseInt(taxRate.split("%")[0]);
        int sR = Integer.parseInt(socialRate.split("%")[0]);
        return (salary * tR / 100) + (salary * sR / 100);
    }
}

class ResidentEmployee extends Employee {
    private static String taxRate = "15%";
    private static String socialRate = "10%";

    public ResidentEmployee(String name, String surname) {
        super(name, surname);
    }

    public static String getTaxRate() {
        return taxRate;
    }

    public static String getSocialRate() {
        return socialRate;
    }

    @Override
    public String toString() {
        return "ResidentEmployee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", taxRate='" + getTaxRate() + '\'' +
                ", socialRate='" + getSocialRate() + '\'' +
                '}';
    }
}

class NoResidentEmployee extends Employee {
    private static String taxRate = "20%";
    private static String socialRate = "3%";

    public NoResidentEmployee(String name, String surname) {
        super(name, surname);
    }

    public static String getTaxRate() {
        return taxRate;
    }

    public static String getSocialRate() {
        return socialRate;
    }

    @Override
    public String toString() {
        return "NoResidentEmployee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", taxRate='" + getTaxRate() + '\'' +
                ", socialRate='" + getSocialRate() + '\'' +
                '}';
    }
}

class Contractor extends Employee {
    private static String taxRate = "0%";
    private static String socialRate = "0%";

    public Contractor(String name, String surname) {
        super(name, surname);
    }

    public static String getTaxRate() {
        return taxRate;
    }

    public static String getSocialRate() {
        return socialRate;
    }

    @Override
    public String toString() {
        return "Contractor{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}


class Main {
    public static void main(String[] args) {
        ResidentEmployee resAIvanov = new ResidentEmployee("Aleksandr", "Ivanov");
        double taxesIvanov = resAIvanov.CalculateTax(1000, resAIvanov.getTaxRate(), resAIvanov.getSocialRate());
        System.out.println(resAIvanov);
        System.out.println("Сумма налогов: " + taxesIvanov);
        NoResidentEmployee noResIVassiljev = new NoResidentEmployee("Igor", "Vassiljev");
        double taxesVassiljev = noResIVassiljev.CalculateTax(1000, noResIVassiljev.getTaxRate(), noResIVassiljev.getSocialRate());
        System.out.println(noResIVassiljev);
        System.out.println("Сумма налогов: " + taxesVassiljev);
        Contractor conMSidorov = new Contractor("Mihhail", "Sidorov");
        double taxesSidorov = conMSidorov.CalculateTax(1000, conMSidorov.getTaxRate(), conMSidorov.getSocialRate());
        System.out.println(conMSidorov);
        System.out.println("Сумма налогов: " + taxesSidorov);
    }
}