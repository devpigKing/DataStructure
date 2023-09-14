package chap01;

import java.util.Scanner;

public class TwoDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        do {
            n = sc.nextInt();
        } while (!(n >= 10 && n <= 99));

        System.out.println(n);


    }
}
