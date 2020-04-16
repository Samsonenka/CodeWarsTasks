package sumArrays;

public class SumArrays {

    public static void main(String[] args) {

    }

    public static int arrayPlusArray(int[] ints, int[] ints1) {

        int sum = 0;

        for (int array1: ints) {
            sum += array1;
        }

        for (int array2: ints1) {
            sum += array2;
        }

        return sum;
    }
}
