public class Person {

    private String name;
    private int age;
    private double long1;

    public Person(String name, int age, double long1) {
        this.name = name;
        this.age = age;
        this.long1 = long1;
    }

    public double getLong1() {
        return long1;
    }

    public void setLong1(double long1) {
        this.long1 = long1;
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

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", long1=" + long1 +
                '}';
    }
}
