package chap01;

import java.util.Scanner;

public class SunForEx8 {
    static int sumof(int a, int b) {

        int min = 0;
        int max = 0;

        if (a < b) {
            min = a;
            max = b;
        } else {
            min = b;
            max = a;
        }

        int sum = 0;
        for (int i = min; i <= max; i++ ) {
            sum += i;
        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(sumof(a, b));

    }
}
