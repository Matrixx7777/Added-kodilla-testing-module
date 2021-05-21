package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public void beautify(String a, String b, PoemDecorator poemDecorator){
        String a1 = poemDecorator.decorate(a,b);

        System.out.println("Result = " + a1);
    }

    public String toUpperCase(String a, String b,String c, PoemDecorator2 poemDecorator){
        String a2 = poemDecorator.toUpperCase(a,b,c);
        System.out.println(a2);
        return a2;
    }


}
