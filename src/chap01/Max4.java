package chap01;


public class Max4 {

    static int max4(int a, int b, int c, int d) {

        int max = 0;

        if (a > max) {
            max = a;
        }

        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        if (d > max) {
            max = d;
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println("max3(3,5,3,1) = " + max4(3,5,3,1));
    }

}
