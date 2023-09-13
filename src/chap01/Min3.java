package chap01;

public class Min3 {

    static int min3 (int a, int b, int c) {
        int min = a;         			// 최솟값
        if (b < min) min = b;
        if (c < min) min = c;

        return min;
    }

    public static void main(String[] args) {

        System.out.println("min3(99, 22, 101) = " + min3(99, 22, 101));

    }
}
