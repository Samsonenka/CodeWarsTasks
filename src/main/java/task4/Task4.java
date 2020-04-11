package task4;

/* Given three integers a ,b ,c, return the largest number obtained after inserting the
following operators and brackets: +, *, ()
In other words , try every combination of a,b,c with [*+()] , and return the Maximum Obtained */


public class Task4 {

    public static int expressionsMatter(int a, int b, int c)
    {
        int result = 0;
        int[] arr = new int[5];

        arr[0] = a * (b + c);
        arr[1] = a * b * c;
        arr[2] = a + b * c;
        arr[3] = (a + b) * c;
        arr[4] = a + b + c;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > result)
                result = arr[i];
        }
        return result;
    }
}
