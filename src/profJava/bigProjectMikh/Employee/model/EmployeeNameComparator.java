package profJava.bigProjectMikh.Employee.model;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employees> {

    @Override
    public int compare(Employees o1, Employees o2) {
        int res = o1.getFamilyname().compareTo(o2.getFamilyname());
        if(res == 0) {
            return o1.getName().compareTo(o2.getName());
        }
        return res;
    }
}
