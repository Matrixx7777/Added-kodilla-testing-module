package com.kodilla.testing.collection;

import java.util.Collections;
import java.util.List;

public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers) {
        return exterminate(Collections.emptyList());
    }

    public static void main (String[] args){
        Method even1 = new Method();
        even1.evenNumbers();
    }

}

class Method{
    int a = 0;

    public void evenNumbers(){

        int result = 0;
            for(int i=0; i<50; i++){
                    a++;
                    result = a*2;
                    System.out.println(result);

        }

    }
}
