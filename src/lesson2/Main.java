package lesson2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String engineType = in.next(); // Вводим название двигателя
        double sizeOfWheel = in.nextDouble(); // Вводим дюйм колеса
        Volvo volvo = new Volvo(engineType, sizeOfWheel); // Передаем введенные данные
        volvo.runEngine();
        System.out.println();
        Volvo volvo1 = new Volvo();
        volvo1.engineType = "Petrol";
        volvo1.wheelSize = 123.2;
        volvo1.runEngine();
        System.out.println();
        Volvo volvo2 = new Volvo("Electro");
        volvo2.runEngine();

    }
    /* todo
        Volvo -> class
        Mercedes-Benz -> class
        Cadillac -> class
        Autopark -> class
        runEngine -> method
        wheelSize -> field
        engineType -> field
     */
}

class Volvo {
    // Конструктор -> это специальный метод, который является входной точкой для работы с объектом (с полями класса, с методами)
    // В Java ВСЕГДА (!) есть конструктор (даже когда мы его не пишем - он пустой)

    public Volvo() { // Обязательное условие конструктора - название конструктора (метода) совпадает с названием класса (иначе это просто обычный метод)
        // в конструкторе нет возвращаемого типа. Конструктор всегда без слова static
    }
    // Конструкторов может быть несколько
    // Когда ты явно создаешь свой конструктор, пустой конструктор по умолчанию (который мы не видим - исчезает)
    public Volvo(String engineType, double wheelSize) {
        if (wheelSize < 5.0 || wheelSize > 30.2) {
            System.out.println("Вы ввели некорректные данные");
            // System.exit(0); // Завершение программы в целом
            return; // завершение метода
        }
        this.engineType = engineType;
        this.wheelSize = wheelSize;
        // this -> ключевое слово, позволяющее "указывать" на поле/метод/вложенный класс данного класса
    }
    public Volvo(String engineType) {
        this.engineType = engineType;
        this.wheelSize = 15.2;
    }

    String engineType;
    double wheelSize;

    public void runEngine() {
        System.out.println("Engine type: " + engineType
                + "\nwheel size: " + wheelSize
                + "\nWireless start up");
    }
}

class Autopark {
    Volvo[] array = new Volvo[100];
    // array -> поле
    // Volvo (тип данных поля) -> класс
}
