package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {

//            System.out.println("Welcome to module 7 - Stream");
//            SaySomething saySomething = new SaySomething();
//            saySomething.say();

//            Processor processor = new Processor();
//            ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
//            processor.execute(executeSaySomething);

        Processor processor = new Processor();
        Executor codeToExecute = () -> System.out.println("This is an example text.");
        processor.execute(codeToExecute);

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(11, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println();

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        System.out.println();

        // Task
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Three", "Seven",(a,b) -> "[" +  a + b + "text" + "]");
        poemBeautifier.beautify("Girl","Boy",(a,b) -> a + " + " + b + " = Couple");

        poemBeautifier.toUpperCase( "Child "," Dad "," Mom",(a,b,c) -> "Family = "+ "[" +a+b+c + "]");
        poemBeautifier.toUpperCase( " ABC "," DEF "," GHI ",(a,b,c) -> "Alphabet = "+ a+b+c);


    }
}
