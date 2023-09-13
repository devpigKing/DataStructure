package chap01;

import java.util.Scanner; // java.util 패키지에 있는 Scanner 클래스를 프로그램에 포함시킨다.

public class Max3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // System.in은 키보드와 연결된 표준 입력 스트림(standard input stream)입니다.

        System.out.println("세 정수의 최댓값을 구합니다.");
        System.out.println("a의 값 : ");
        int a = sc.nextInt(); // 키보드로 입력한 int형 정수를 읽어 들이는 부분
        System.out.println("b의 값 : ");
        int b = sc.nextInt();
        System.out.println("c의 값 : ");
        int c = sc.nextInt();

        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;

        System.out.println("최댓값은 " + max + "입니다.");
    }
}
