package com.Java8Practice;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupByCountAndSort {
    public static void main(String[] args) {

        //3 apple, 2 banana, others 1
        List<String> items =
                Arrays.asList ( "apple", "apple", "banana",
                                "apple", "orange", "banana", "papaya" );

       Map<String,Long> map= items.stream ().sorted ().collect ( Collectors.groupingBy (Function.identity (),Collectors.counting ()  ) );
        System.out.println (map);

        Map<String,Long> m1= new LinkedHashMap<> (  );



    }
}
