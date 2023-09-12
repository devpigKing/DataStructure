package chap01;

// 3개의 정숫값 가운데 최댓값을 구하여 출력
public class Max3Method {

    // a, b, c의 최댓값을 구하여 반환
    static int max3(int a, int b, int c) {
        int max = a;
        if(b > max) // 최댓값
            max = b;
        if(c > max)
            max = c;


        return max;
    }


    public static void main(String[] args) {
        System.out.println("max3(3,2,1) = " + max3(3, 2, 1));
        System.out.println("max3(3,2,2) = " + max3(3, 2, 2));
        System.out.println("max3(3,1,2) = " + max3(3, 1, 2));
        System.out.println("max3(3,2,3) = " + max3(3, 2, 3));


    }
}
