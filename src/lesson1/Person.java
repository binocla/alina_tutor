package lesson1;

public class Person {
    String name = "This name might be changed";
    int age;
    static int amountOfLegs;

    public void sayHello() {
        System.out.println("Hi, my name is " + name
                + ". My age is " + age + ". Amount of legs: "
                + amountOfLegs);
    }

    public static int yearsToEighteen(int currAge) {
        if (currAge >= 18) {
            return 0;
        }
        return 18 - currAge;
    }
}
