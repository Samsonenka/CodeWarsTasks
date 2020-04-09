package task1;

import java.util.ArrayList;
import java.util.List;

public class Task1 {

    public static void main(String[] args) {

        System.out.println(digital_root(132189));
    }

    public static int digital_root(int n) {

        int number = n;

        while (number > 10){
            List<Integer> integerList = new ArrayList<Integer>();

            while (number > 0){
                integerList.add(number % 10);
                number = number / 10;
            }

            for(Integer value: integerList){
                System.out.println(value);
                number += value;
            }

        }
        return number;
    }
}