package chap01;

import java.util.Scanner;

public class Median {

    static int med3( int a, int b, int c ) {

        if ( a >= b )
            if ( b >= c )
                return b;
            else if ( a <= c )
                return a;
            else
                return c;
        else if ( a > c )
            return a;
        else if ( b > c )
            return c;
        else
            return b;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 정수를 입력하시오 : ");
        int a = sc.nextInt();
        System.out.println("두 번째 정수를 입력하시오 : ");
        int b = sc.nextInt();
        System.out.println("세 번째 정수를 입력하시오 : ");
        int c = sc.nextInt();

        System.out.println("최솟값은 " +  med3(a, b, c) + " 입니다");
    }
}
