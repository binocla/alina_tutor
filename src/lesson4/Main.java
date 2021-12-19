package lesson4;


import java.util.Scanner;

// Инкапсуляция [x]
// Наследование [v]
// Полиморфизм
// Абстракция
// ООП -> Объектно-ориентированное программирование
// JavaScript -> функциональный язык
// func(int x, int y) -> return x + y;
public class Main {
    public static void main(String[] args) {
        Human human = new Human("Binocla", 19, 65, 180);
        // переменная human это объект Human
        // переменная human это экземпляр класса Human
        Student student = new Student(human, 2, 100);
        Magistrant magistrant = new Magistrant(human, student, 2);

        System.out.println(student.toString());
        System.out.println(magistrant.toString());
        System.out.println(student.getWeight());
        System.out.println(student.getHeight());
        System.out.println(human.toString());
        System.out.println(magistrant.getHeight());
    }
}

class Human {
    private String name;
    private int age;
    private double weight;
    private double height;

    public Human(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}

// class A extends B -> класс A наследуется от B
// Когда класс A наследуется от класса B - он перенимает ВСЕ МЕТОДЫ, ПОЛЯ, КОНСТРУКТОРЫ
// В такой ситуации класс A -> наследник / дочерний класс. Класс B -> родитель / родительский класс / суперкласс
// Основная идея наследования -> расширять функционал дочерних классов
// В Java нет множественного наследования у класса
// Human & Main -> blabla();
// blabudentla(); -> Human, Main (?)
class Student extends Human {
    private int course;
    private double budget;

    public Student(Human human, int course, double budget) {
        super(human.getName(), human.getAge(), human.getWeight(), human.getHeight());
        this.course = course;
        this.budget = budget;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name=" + getName() +
                ", age=" + getAge() +
                ", course=" + course +
                ", budget=" + budget +
                '}';
    }
}

class Magistrant extends Student {
    private int yearsToEnding;

    public Magistrant(Human human, Student student, int yearsToEnding) {
        super(human, student.getCourse(), student.getBudget());
        // this.yearsToEnding = yearsToEnding;
        setYearsToEnding(yearsToEnding);
        // Ключевое слово super означает обращение к суперклассу (родительскому)
        // super(...) -> обращение к конструктору родительского класса
        // super.*название не приватного поля* -> обращение к полю суперкласса
        // super.blabla() -> обращение к методу суперкласса
    }

    public int getYearsToEnding() {
        return yearsToEnding;
    }

    public void setYearsToEnding(int yearsToEnding) {
        if (yearsToEnding > 2) {
            System.out.println("Нельзя");
        }
        this.yearsToEnding = yearsToEnding;
    }

    @Override
    public String toString() {
        return "Magistrant{" +
                "name=" + getName() +
                ", age=" + getAge() +
                ", budget=" + getBudget() +
                ", yearsToEnding=" + yearsToEnding +
                '}';
    }
}
// Magistrant extends Student -> Student extends Human : Magistrant -> Human
/* todo
    Есть зоопарк и набор сущностей: Animal, Cat, Dog, DomesticCat, Puma
    у Animal есть String name, int age
    у Cat помимо этого есть String color
    у Dog помимо этого есть String specie
    у DomesticCat помимо этого есть boolean loveMilk : значение loveMilk зависит от цвета Cat ("white" (любой регистр) -> true, иначе -> false)
    у Puma помимо этого есть boolean isInZoo
    у Dog есть метод voice() -> выводит "Gav"
    у Cat есть метод voice() -> выводит "Meow"
    У каждого сгенерировать toString() (текст вывода можно свой)
    Соблюдать принцип инкапсуляции
 */


