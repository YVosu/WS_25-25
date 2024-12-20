package PKA.VL_05;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int birthyear) {
        this.age = birthyear;
    }

    @Override
    public String toString() {
        return "Person{name = '" + name + "', birthyear = " + age + '}';
    }
}
