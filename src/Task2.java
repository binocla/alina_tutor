import java.util.Scanner;

//public class Task2 {
//    public static void main(String[] args) {
//        String s = "qweqwe";
//        s.charAt(0);
//        Scanner in = new Scanner(System.in); // Считываем с клавиатуры
//        int n = in.nextInt();
//        // 2^31-1 Integer.MAX_VALUE
//        // 2^63-1 Long.MAX_VALUE
//        for (int i = 0; i < Integer.MAX_VALUE; i++) {
//            int temp = i;
//            int amountOfDigits = 1;
//            int counterOfPositiveChanges = 1;
//            int counterOfNegativeChanges = -1;
//            while (temp / 10 != 0) { // 1-9 : 102
//                int lastDigit = temp % 10; // 321 -> 1
//                int preLastDigit = temp / 10 % 10; // 321 / 10 -> 12 % 10 -> 2
//                if (lastDigit - preLastDigit > 0) {
//                    counterOfPositiveChanges = counterOfPositiveChanges + 1;
//                } else if (lastDigit - preLastDigit < 0) {
//                    counterOfNegativeChanges = counterOfNegativeChanges - 1;
//                }
//                amountOfDigits = amountOfDigits + 1;
//                temp = temp / 10;
//            }
//            if (amountOfDigits <= 2 || counterOfPositiveChanges == amountOfDigits || (-1) * (counterOfNegativeChanges) == amountOfDigits) {
//                if (n == 0) {
//                    System.out.println(i);
//                    break;
//                }
//                n--;
//            }
//        }
//    }
//}

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Считываем с клавиатуры
        int n = in.nextInt();
        // 2^31-1 Integer.MAX_VALUE
        // 2^63-1 Long.MAX_VALUE
        checkIfNisOk(n);
    }

    public static void checkIfNisOk(int n) {
        if (n >= 3500 || getNvalue(n) == -1) {
            System.out.println("Не подходит");
        } else {
            System.out.println(getNvalue(n));
        }
    }

    public static int getNvalue(int n) {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            int temp = i;
            int amountOfDigits = 1;
            int counterOfPositiveChanges = 1;
            int counterOfNegativeChanges = -1;
            while (temp / 10 != 0) { // 1-9 : 102
                int lastDigit = temp % 10; // 321 -> 1
                int preLastDigit = temp / 10 % 10; // 321 / 10 -> 12 % 10 -> 2
                if (lastDigit - preLastDigit > 0) {
                    counterOfPositiveChanges = counterOfPositiveChanges + 1;
                } else if (lastDigit - preLastDigit < 0) {
                    counterOfNegativeChanges = counterOfNegativeChanges - 1;
                }
                amountOfDigits = amountOfDigits + 1;
                temp = temp / 10;
            }
            if (amountOfDigits <= 2 || counterOfPositiveChanges == amountOfDigits || (-1) * (counterOfNegativeChanges) == amountOfDigits) {
                if (n == 0) {
                    return i;
                }
                n--;
            }
        }
        return -1;
    }
}