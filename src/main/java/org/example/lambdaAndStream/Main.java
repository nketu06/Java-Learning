package org.example.lambdaAndStream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){

        // example of biConsumer
        BiConsumer<Integer,Integer> biConsumer = (a,b) -> System.out.println(a+b);
        biConsumer.accept(4,6);

        List<Integer> integerList = Arrays.asList(1,2,3,4);
        integerList.forEach(x->System.out.println(x*2));


        // example of map
        List<Integer> squareList = integerList.stream().map(x->x*x).toList();
        System.out.println(squareList);

        System.out.println("answer");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // example of filter
        List<Integer> myList= numbers.stream().filter(x->x%2==0).toList();
        myList= numbers.stream().filter(x->x%2==0).collect(Collectors.toList());
        for(Integer i:myList){
            System.out.println(i);
        }

        // string start with capital T and then change to uppercase
        List<String> names = List.of("Tantia Tope", "Rani Lakshmibai", "Mangal Pandey", "Nana Sahib");
        names.stream().filter(x->x.startsWith("T")).map(x->x.toUpperCase()).forEach(System.out::println);

        // sum
        System.out.println(numbers.stream().reduce(0,(x,y)->x+y));

        // find max
        System.out.println(numbers.stream().reduce((a,b)->a>b? a:b));


        // checking all are even
        System.out.println(numbers.stream().allMatch(x->x%2==0));


        // printing distinct number
        numbers.stream().distinct().forEach(System.out::println);

        // sorting with length of names
        names.stream().sorted((a,b)->a.length()-b.length()).forEach(System.out::println);


        // count sentence having java, and spit and count
        List<String> sentences = Arrays.asList(
                "Python is a programming language.",
                "JavaScript is used for web development.",
                "Ruby is known for its simplicity."
        );
        long countOfUniqueWords = sentences.stream().filter(sentence -> !sentence.contains("Java"))
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .distinct()
                .count();
        System.out.println(countOfUniqueWords);


        sentences.stream().filter(sentence -> sentence.contains("Java")).mapToInt(x->x.length()).average().orElse(0);

        List<String> words = List.of("hello", "world"); // map vs flat map
        List<List<Character>> mapped = words.stream()
                .map(word -> word.chars().mapToObj(c -> (char) c).toList())
                .collect(Collectors.toList());// Output: [[h, e, l, l, o], [w, o, r, l, d]] (Nested list)

        List<Character> flatMapped = words.stream()
                .flatMap(word -> word.chars().mapToObj(c -> (char) c))
                .collect(Collectors.toList()); // Output: [h, e, l, l, o, w, o, r, l, d] (Flattened list)


    }
}
