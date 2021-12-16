package lesson3;

public class AnotherExample {
    public static void main(String[] args) {
        Person p = new Person("qwe", 54, 'M');
        System.out.println(p.getAge());
        p.setAge(70);
        System.out.println(p.getAge());
        // Имя: *имя*, возраст: *возраст*, пол: *гендер*
        System.out.println(p);
    }
}

class Person {
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (gender != 'M' && gender != 'F') {
            System.out.println("У нас только два гендера");
            return;
        }
        this.gender = gender;
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
        if (age < 0 || age > 100) {
            System.out.println("Неправильный возраст");
            return;
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "Имя: " + name + ", возраст: " + age + ", пол: " + gender;
    }
}
