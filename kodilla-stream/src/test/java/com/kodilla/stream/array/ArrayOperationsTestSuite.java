package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage(){
        //Given
        int[] a1 = {1,3,5,7,9,11,13,4};
        //When
        ArrayOperations.getList(a1);
        double a2 = ArrayOperations.getAverage(a1);
        //Then
        assertEquals(6.0,a2,0.625 );


    }
}
