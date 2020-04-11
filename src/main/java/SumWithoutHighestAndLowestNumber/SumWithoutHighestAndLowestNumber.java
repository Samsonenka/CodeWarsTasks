package SumWithoutHighestAndLowestNumber;

public class SumWithoutHighestAndLowestNumber {

    public static void main(String[] args) {

        int[] ar = new int[]{ 5, 1, 2, 1, 1 };
        System.out.println(sum(ar));
    }

    public static int sum(int[] numbers) {

        if (numbers.length == 0 || numbers.length == 1 || numbers == null){
            return 0;
        }

        int minNumber = numbers[0];
        int maxNumber = numbers[0];
        int sum = 0;

        for (int i = 0; i < numbers.length; i++){

            if (numbers[i] < minNumber){
                minNumber = numbers[i];
            }

            if (numbers[i] > maxNumber){
                maxNumber = numbers[i];
            }
        }

        for (int i = 0; i < numbers.length; i++) {

            sum += numbers[i];
        }

        return sum - minNumber - maxNumber;
    }
}
