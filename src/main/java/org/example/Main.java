package org.example;


import java.util.List;

public class Main {
        static int x = 10;

        public static void main(String[] args) {
            List<List<String>> listOfLists = List.of(
                    List.of("apple", "banana"),
                    List.of("cherry", "date"),
                    List.of("elderberry", "fig")
            );

            listOfLists.stream().flatMap(x->x.stream()).forEach(x-> System.out.print(x+" "));
            System.out.println();

            listOfLists.stream().map(x->x.get(0)).forEach(x-> System.out.print(x+" "));

        }
    }






