package test221017;

public class TestVjacheslav {
    private int age;
    private int num;
    private String name;
    private String familyname;

    public TestVjacheslav(int age, int num, String name, String familyname) {
        this.age = age;
        this.num = num;
        this.name = name;
        this.familyname = familyname;
    }

    public TestVjacheslav() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamilyname() {
        return familyname;
    }

    public void setFamilyname(String familyname) {
        this.familyname = familyname;
    }

    public static void main(String[] args) {
        TestVjacheslav person1 = new TestVjacheslav();
        TestVjacheslav person2 = new TestVjacheslav();
        TestVjacheslav person3 = new TestVjacheslav(22, 45, "Sergei", "Petrov");
    }
}
