package lesson4;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int cnt = 0;
        boolean flag = false;
        boolean isChanged = false;
        String hash = "#";
        String star = "*";
        for (int i = 0; i < s; i++) { // высота ромба
            String str = "";
            int tmp;
            if (!isChanged) {
                tmp = i;
            } else {
                tmp = s - i;
            }
            int start = 0;
            while (start <= s / 2 - tmp) {
                if (!isChanged) {
                    str = str + hash;
                } else {
                    str = str + star;
                }
                start++;
            }
            while (tmp > 0) {
                str = str + " ";
                tmp--;
                start++;
            }
            start = 0;

            if (!isChanged) {
                while (start < s / 2 - tmp - cnt) {

                    if (s / 2 - tmp - cnt - start == 1 && i == s / 2) {
                        str = str + "#";
                        isChanged = true;
                    } else {
                        if (isChanged) {
                            str = str + hash;
                        } else {
                            str = str + star;
                        }
                    }
                    start++;
                }
            } else {
                while (start >= s / 2 - tmp - cnt) {
                    str = str + hash;
                    start--;
                }
            }
            if (s % 2 == 0 || flag) {
                cnt++;
            } else {
                flag = true;
            }
            System.out.println(str);
        }
    }
    // s = 11, 6 #, 5 *
    // s = 11, 5 #, 1 _, 5 *
    // s = 11, 4 #, 2 _, 4 *
    // s = 11, 5 #, 1 _, 5 *
    // s = 11, 5 #, 1 _, 5 *
}
