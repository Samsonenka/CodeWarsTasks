package myLanguages;

import java.util.*;

public class MyLanguages {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Java", 80);
        map.put("C++", 20);
        map.put("C#", 60);
        map.put("Pascal", 65);

        List<String> stringList =  myLanguages(map);
        System.out.println(stringList);
    }

    public static List<String> myLanguages(final Map<String, Integer> results) {

        List<String> integerList = new ArrayList<>();

        for (Map.Entry<String, Integer> entry: results.entrySet()){
            if (entry.getValue() >= 60){
                integerList.add(entry.getKey());
            }
        }


        return integerList;
    }
}
