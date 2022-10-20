package test221017;

public class TestAlina {
    private String name;
    private Integer age;

    public TestAlina(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public static void main(String[] args) {
        TestAlina person1 = new TestAlina("Alina", 22);
        TestAlina person2 = new TestAlina("Alex", 55);
        TestAlina person3 = new TestAlina("Andrei", 43);
    }

}
