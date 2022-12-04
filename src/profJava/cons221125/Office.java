package profJava.cons221125;

import java.util.*;

//Class type Singletone
public class Office implements Iterable<Employee>{

    public class ExperComparator implements Comparator<Employee> {//создали компаратор для сортировки по опыту

        @Override
        public int compare(Employee o1, Employee o2) {
            return (int)(o1.getExperience() - o2.getExperience());
        }
    }

    public class SalaryComparator implements Comparator<Employee> {

        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getSalaryEuro() - o2.getSalaryEuro();
        }
    }

    public class PositionNameComporator implements Comparator<Employee> {
        @Override
        public int compare(Employee o1, Employee o2) {
            int res = o1.getEType().getValue() - o2.getEType().getValue();
            if (res == 0){
                res = o1.getSecondName().compareTo(o2.getSecondName());
                    if (res == 0){
                        res = o1.getName().compareTo(o2.getName());
                    }
            }
            return res;
        }
    }

    public void sortByExp(){//логика как бы не относится к офису
        employees.sort(new ExperComparator());
    }

    public void sortBySalary() {
        employees.sort(new SalaryComparator());
    }

    public void sortByPosAndName(){
        employees.sort(new PositionNameComporator());
    }

    public class EmployeeIterator implements Iterator<Employee> {

        int idx = 0; //нужен pointer всегда
        List<Employee> employees;  // объект, по которому будем итерироваться
        public EmployeeIterator(List<Employee> employees){//конструктор
            this.employees = employees;
        }
        @Override
        public boolean hasNext() {
            return idx < employees.size();
        }

        @Override
        public Employee next() {
            if(!hasNext())  // пишем без скобок, просто выделением
                throw new NoSuchElementException();
            return employees.get(idx++);
        }
    }

    static Office mOffice = null; //объект офис, который инициализируется null
    List<Employee> employees = new LinkedList<Employee>();

//    public List<Employee>getEmployees(){ //такая функция небезопасна,потому что кто-то может исправить наш список
//        return employees;
//    }

//    public List<Employee> getEmployees(){// новый лист, но сожрет кучу памяти, лучше сделаем итератор
//        return new LinkedList<>(employees);
//    }



    static Office getOffice() { //если объекта офис нет,мы его создаем
        if (mOffice == null) {
            mOffice = new Office();
        }
        return mOffice;
    }

    public void addEmployee(Employee e) {
        employees.add(e);
        Collections.sort(employees);
    }

    public boolean removeEmployee(String name, String secondName) {
        boolean res = false; // цикл foreach нельзя использовать  для удаления налету
        Iterator<Employee> ie = employees.iterator();
        while (ie.hasNext() && res == false) { //итерируемся, пока флаг не поменяется  и есть след
            Employee employee = ie.next();
            if (employee.getName().equals(name) && employee.getSecondName().equals(secondName))  {
                ie.remove();
                res = true; //изменить результат
            }
        }
        return res;
    }
    private Office() {// приватный конструктор

    }

    @Override
    public Iterator<Employee> iterator() {
        //return employees.iterator(); //вернем коллекцию, но так тоже нельзя, коллекцию можно будет изменять
        return new EmployeeIterator(employees); //вот так надо, теперь пишем сам итератор
    }

}
