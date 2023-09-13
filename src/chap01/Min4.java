package chap01;

import java.util.Scanner;

public class Min4 {

    static int min4(int a, int b, int c, int d) {
        int min = a;

        if ( b < min ) min = b;

        if ( c < min ) min = c;

        if ( d < min ) min = d;

        return min;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 정수를 입력하시오 : ");
        int a = sc.nextInt();
        System.out.println("두 번째 정수를 입력하시오 : ");
        int b = sc.nextInt();
        System.out.println("세 번째 정수를 입력하시오 : ");
        int c = sc.nextInt();
        System.out.println("네 번째 정수를 입력하시오 : ");
        int d = sc.nextInt();

        int min = min4(a, b, c, d);

        System.out.println("최솟값은 " + min + " 입니다");
    }
}
