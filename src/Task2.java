import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Считываем с клавиатуры
        int n = in.nextInt();
        // [12; 500]
        int cnt = 0;
        // 2^31-1 Integer.MAX_VALUE
        // 2^63-1 Long.MAX_VALUE
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            int temp = i;
            int amountOfDigits = 1;
            boolean flag = false; // нужна для того, чтобы определить, а выполнилось или не выполнилось условие по одинаковости d
            int counterOfPositiveChanges = 1;
            while (temp / 10 != 0) { // 1-9 : 102
               // System.out.println(temp);
                int lastDigit = temp % 10; // 321 -> 1
                int preLastDigit = temp / 10 % 10; // 321 / 10 -> 12 % 10 -> 2
                if (lastDigit - preLastDigit > 0) {
                    // flag = true;
                    counterOfPositiveChanges = counterOfPositiveChanges + 1;
                } else if (lastDigit - preLastDigit < 0){
                    //flag = false;
                    counterOfPositiveChanges = counterOfPositiveChanges - 1;
                }
                amountOfDigits = amountOfDigits + 1;
                temp = temp / 10;
            }
            System.out.println("Dig " + amountOfDigits);
            System.out.println("changes " + counterOfPositiveChanges);
            if (amountOfDigits <= 2 || Math.abs(counterOfPositiveChanges) == amountOfDigits) {
                if (n == 0) {
                    System.out.println(i);
                    break;
                }
                System.out.println("temp " + i);
                System.out.println("n " + n);
                n--;
            }
        }
//        System.out.println(cnt);
    }
}
