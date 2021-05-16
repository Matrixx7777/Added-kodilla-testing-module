package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test end");
    }

    @DisplayName("when create SimpleUser with realName, " +
            "then getRealName should return real user name"
    )

    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator one = new OddNumbersExterminator();
        List<Integer> randomNumbers = new ArrayList<>();
        randomNumbers.add(4);
        randomNumbers.add(2);
        randomNumbers.add(8);
        randomNumbers.add(11);
        randomNumbers.add(6);

        List<Integer> evenNumbers = new ArrayList<>();
        evenNumbers.add(4);
        evenNumbers.add(2);
        evenNumbers.add(8);
        evenNumbers.add(6);
        //When
        List<Integer> expectedResult = one.exterminate(evenNumbers);
        List<Integer> result = one.exterminate(randomNumbers);
        //Then
        Assertions.assertEquals(expectedResult, result);


    }

}
