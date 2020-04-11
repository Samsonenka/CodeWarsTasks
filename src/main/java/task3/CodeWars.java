package task3;

/* Create a function called that accepts 2 string arguments and returns
an integer of the count of occurrences the 2nd argument is found in the first one.

If no occurrences can be found, a count of 0 should be returned. */

public class CodeWars {

    public static int strCount(String str, char letter) {

        if (str == null || letter == 0)
            return 0;

        int counter = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == letter)
                counter++;
        }
        return counter;
    }
}
