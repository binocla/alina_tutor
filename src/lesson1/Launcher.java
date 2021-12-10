package lesson1;

public class Launcher {
    public static void main(String[] args) {
        // Создание объекта:
        // 1 - указываем название класса
        // 2 - название переменной
        // 3 - new Person();
        Person p1 = new Person(); // Scanner in = new Scanner();
        Person p2 = new Person();
        // p -> объект или экземпляр класса Person
        p1.age = 19; // объект (конкретный) будет иметь возраст 19
        p1.name = "Sergey";
        Person.amountOfLegs = 2;
        p1.sayHello();

        System.out.println(p1.age);
        System.out.println(p1.name);
        System.out.println(p1.amountOfLegs);
        System.out.println(p2.name);
        System.out.println(p2.age);
        System.out.println(p2.amountOfLegs);
        // Мы определили имя/возраст

        System.out.println("--------------------");
        p2.sayHello();
        System.out.println(Person.yearsToEighteen(p1.age));
        System.out.println(Person.yearsToEighteen(p2.age));
    }
}
