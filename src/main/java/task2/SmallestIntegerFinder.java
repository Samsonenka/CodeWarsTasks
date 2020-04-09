package task2;

//Find the smallest integer in the array

public class SmallestIntegerFinder {

    public static int findSmallestInt(int[] args) {

        int minNumber = args[0];

        for (int i = 0; i < args.length; i++){
            if (args[i] < minNumber){
                minNumber = args[i];
            }
        }
        return minNumber;
    }
}
