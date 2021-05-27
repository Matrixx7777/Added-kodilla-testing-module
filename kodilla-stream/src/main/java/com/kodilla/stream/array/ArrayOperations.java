package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {

    static void getList(int[] numbers) {
        IntStream.range(0, numbers.length)
                .forEach(n -> System.out.println(numbers[n]));

    }

    static double getAverage(int[] numbers) {
        double a1 = IntStream.range(0, numbers.length)
                .map( n -> numbers[n])
                .average()
                .orElse(0);
                return a1;
    }
}
