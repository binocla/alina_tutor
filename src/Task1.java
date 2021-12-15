/*
    Посчитать количество чисел от A до B (целые) таких,
    что цифры числа, рассмотренные по порядку слева направо,
    образуют арифметическую или геометрическую прогрессию.
    Будем считать, что все однозначные и двухзначные числа образуют арифметическую прогрессию.
    Для определения, подходит ли число под требования задачи, реализовать функцию.
    Также реализовать функцию для подсчета кол-ва таких чисел от 1 до n.
    Запрещено использовать строки и массивы.
 */

import lesson1.Main;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Считываем с клавиатуры
        System.out.println("Введите числа A и B: ");
        int a = in.nextInt(); // 12
        int b = in.nextInt(); // 500
        System.out.println("Решение задачи 1: ");
        task1(a, b);
        System.out.println();
        System.out.println("Введите число N");
        int n = in.nextInt();
        System.out.println("Решение задачи 2: ");
        task2(n);

    }

    public static void task1(int a, int b) { // От A до B
        // [12; 500]
        int cnt = 0;
        for (int i = a; i <= b; i++) {
            // 123
            // 123 / 10 -> 12, 123 % 10 -> 3 : 123 / 10 -> 12 12 % 10 -> 2
            int temp = i;
            int amountOfDigits = 1; //
            int d = (temp % 10) - (temp / 10 % 10); // 123 -> 3 2
            double q = (temp % 10) / ((double) (temp / 10 % 10));
            boolean flag = false; // нужна для того, чтобы определить, а выполнилось или не выполнилось условие по одинаковости d
            if (q == Double.POSITIVE_INFINITY) {
                flag = true;
                amountOfDigits = 3;
            }
            while (temp / 10 != 0) { // 1-9 : 102
                int lastDigit = temp % 10; // 321 -> 1
                int preLastDigit = temp / 10 % 10; // 321 / 10 -> 12 % 10 -> 2
                if (preLastDigit % 10 == 0) {
                    break;
                }
                amountOfDigits = amountOfDigits + 1;
                if (lastDigit - preLastDigit != d && ((double) (lastDigit) / (double) (preLastDigit) != q)) {
                    flag = true;
                    break;
                }
                temp = temp / 10;
            }
            if (amountOfDigits <= 2 || flag == false) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    public static void task2(int n) { // От 1 до n
        // [12; 500]
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            // 123
            // 123 / 10 -> 12, 123 % 10 -> 3 : 123 / 10 -> 12 12 % 10 -> 2
            int temp = i;
            int amountOfDigits = 1; //
            int d = (temp % 10) - (temp / 10 % 10); // 123 -> 3 2
            double q = (temp % 10) / ((double) (temp / 10 % 10));
            boolean flag = false; // нужна для того, чтобы определить, а выполнилось или не выполнилось условие по одинаковости d
            if (q == Double.POSITIVE_INFINITY) {
                flag = true;
                amountOfDigits = 3;
            }
            while (temp / 10 != 0) { // 1-9 : 102
                int lastDigit = temp % 10; // 321 -> 1
                int preLastDigit = temp / 10 % 10; // 321 / 10 -> 12 % 10 -> 2
                if (preLastDigit % 10 == 0) {
                    break;
                }
                amountOfDigits = amountOfDigits + 1;
                if (lastDigit - preLastDigit != d && ((double) (lastDigit) / (double) (preLastDigit) != q)) {
                    flag = true;
                    break;
                }
                temp = temp / 10;
            }
            if (amountOfDigits <= 2 || flag == false) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
