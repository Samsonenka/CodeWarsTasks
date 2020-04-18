package halvingSum;

public class HalvingSum {

    public static void main(String[] args) {

        System.out.println(halvingSum(25));
    }

    static int halvingSum(int n) {
        int sum = n;
        if (n==3) return 4;
        while (n>1) {
            sum = sum + n/2;
            n = n/2;
        }
        return sum;
    }
}
