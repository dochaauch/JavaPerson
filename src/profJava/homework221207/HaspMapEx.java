package profJava.homework221207;

import com.github.javafaker.Faker;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.*;

public class HaspMapEx {
    @Getter
    @Setter
    static
    class Employee {
        private UUID id = UUID.randomUUID();
        private String name;
        private String familyName;
        private Date dateOfBirth;

        Employee(String name, String familyName, Date dateOfBirth){
            this.name = name;
            this.familyName = familyName;
            this.dateOfBirth = dateOfBirth;
        }

        @Override
        public String toString() {
            DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", familyName='" + familyName + '\'' +
                    ", dateOfBirth=" + dateFormat.format(dateOfBirth) +
                    '}';
        }
    }

    @Getter
    @Setter
    @AllArgsConstructor
    static class DataOfEmployee {
        private UUID id;
        private String position;
        private Date startDate;
        private Date endDate;
        private Double salary;

        @Override
        public String toString() {
            DecimalFormat decimalFormat = new DecimalFormat("#0.00");
            decimalFormat.setDecimalSeparatorAlwaysShown(true);
            decimalFormat.setDecimalFormatSymbols(
                    new DecimalFormatSymbols(Locale.US)
            );
            DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
            return "DataOfEmployee{" +
                    "id=" + id +
                    ", position='" + position + '\'' +
                    ", startDate=" + dateFormat.format(startDate) +
                    ", endDate=" + dateFormat.format(endDate) +
                    ", salary=" + decimalFormat.format(salary) +
                    '}';
        }
    }

    public static class Generator {
        public Employee createEmployee(){
            Faker faker = new Faker();
            Employee e = new Employee(faker.name().firstName(), faker.name().lastName(), faker.date().birthday(18, 67));
            return e;
        }

        public DataOfEmployee createDataForEmployee(Employee e) {
            Random random = new Random();
            Faker faker =  new Faker();
            Date date1 =  new Date(91, 0, 0);
            Date date2 = new Date();
            DataOfEmployee doe;
            if(date1.before(date2) || date1.equals(date2)) {
                doe = new DataOfEmployee(e.getId(), faker.job().position(),
                        faker.date().between(date1, date2),
                        new Date(200, 0, 01), random.nextDouble(100.00, 10000.00));
            } else {
                doe = new DataOfEmployee(e.getId(), faker.job().position(),
                        faker.date().between(date2, date1),
                        new Date(200, 0, 01), random.nextDouble(100.00, 10000.00));
            }
            return doe;
        }
    }

    @Getter
    @Setter
    @ToString
    static
    class DataBase{
        private TreeMap map;
        private List<DataOfEmployee> listDOE;
        DataBase(){
            this.listDOE = new ArrayList<DataOfEmployee>();
            this.map = new TreeMap<Employee, List<DataOfEmployee>>(new Comparator<Employee>() {
                @Override
                public int compare(Employee o1, Employee o2) {
                    int res = o1.familyName.compareTo(o2.familyName);
                    if (res == 0) {
                        res = o1.name.compareTo(o2.name);
                    }
                    return res;
                }
            });
        }
    }

    public class Main {
        public static void main(String[] args) {
            Generator generator = new Generator();
            DataBase db = new DataBase();
            for (int i = 0; i < 10; i++) {
                db.listDOE.clear();
                Employee e = generator.createEmployee();

                db.map.put(e, db.listDOE);
                System.out.println(e);
                for (int j = 0; j < 3; j++) {
                    DataOfEmployee doe = generator.createDataForEmployee(e);
                    db.listDOE.add(doe);
                }
            }
            System.out.println(db.map);
            System.out.println(db.map.keySet());
        }
    }
}
