package org.example.lambdaAndStream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){

        BiConsumer<Integer,Integer> biConsumer = (a,b) -> System.out.println(a+b);
        biConsumer.accept(4,6);

        List<Integer> integerList = Arrays.asList(1,2,3,4);
        integerList.forEach(x->System.out.println(x*2));

        List<Integer> squareList = integerList.stream().map(x->x*x).toList();
        System.out.println(squareList);

        System.out.println("answer");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> myList= numbers.stream().filter(x->x%2==0).toList();
        myList= numbers.stream().filter(x->x%2==0).collect(Collectors.toList());
        for(Integer i:myList){
            System.out.println(i);
        }


        List<String> names = List.of("Tantia Tope", "Rani Lakshmibai", "Mangal Pandey", "Nana Sahib");
        names.stream().filter(x->x.startsWith("T")).map(x->x.toUpperCase()).forEach(System.out::println);

        System.out.println(numbers.stream().reduce(0,(x,y)->x+y));

        // find max
        System.out.println(numbers.stream().reduce((a,b)->a>b? a:b));

    }
}
