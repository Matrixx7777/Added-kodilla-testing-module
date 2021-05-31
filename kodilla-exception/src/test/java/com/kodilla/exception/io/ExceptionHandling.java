package com.kodilla.exception.io;

import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExceptionHandling {

    @Test
    void testProbablyIWillThrowException(){
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();
        //When & Then
        assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.5,7.5));

    }

    @Test
    void testIfXIsLessThanOneAndBiggerThanTwoOrEqualsTwoWithYEqualsOneAndHalf(){
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();
        //When & Then
        assertAll(
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(-7,1.5)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(6,1.5)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2,1.5))
        );
    }

    @Test
    void testIfXAndYEqualsZero(){
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();
        //When & Then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.0,0.0));

    }








}
