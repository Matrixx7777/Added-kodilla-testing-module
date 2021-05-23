package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

//        //Module 7.1
//            System.out.println("Welcome to module 7 - Stream");
//            SaySomething saySomething = new SaySomething();
//            saySomething.say();
//
//            Processor processor = new Processor();
//            ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
//            processor.execute(executeSaySomething);
//
//        Processor processor = new Processor();
//        Executor codeToExecute = () -> System.out.println("This is an example text.");
//        processor.execute(codeToExecute);
//
//        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
//
//        System.out.println("Calculating expressions with lambdas");
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
//        expressionExecutor.executeExpression(11, 5, (a, b) -> a - b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);
//
//        System.out.println();
//
//        System.out.println("Calculating expressions with method references");
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
//
//        System.out.println();
//
//        // Task 7.1
//        PoemBeautifier poemBeautifier = new PoemBeautifier();
//
//        poemBeautifier.beautify("Three", "Seven",(a,b) -> "[" +  a + b + "text" + "]");
//        poemBeautifier.beautify("Girl","Boy",(a,b) -> a + " + " + b + " = Couple");
//
//        poemBeautifier.toUpperCase( "Child "," Dad "," Mom",(a,b,c) -> "Family = "+ "[" +a+b+c + "]");
//        poemBeautifier.toUpperCase( " ABC "," DEF "," GHI ",(a,b,c) -> "Alphabet = "+ a+b+c);
//
//        System.out.println();
//
//        // Task 7.2
//        System.out.println("Using Stream to generate even numbers from 1 to 20");
//        NumbersGenerator.generateEven(20);
//
//        People.getList().stream()
//                .forEach(System.out::println);

        //Module 7.3
        BookDirectory theBookDirectory = new BookDirectory();
        theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .forEach(System.out::println);

        System.out.println("\n" + "--------------------" + "\n");

        System.out.println(".toMap:");
        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));

        System.out.println("# elements: " + theResultMapOfBooks.size());
        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

        System.out.println("\n" + "--------------------" + "\n");

        System.out.println(".toList:");
        BookDirectory theBookDirectory2 = new BookDirectory();
        List<Book> theResultListOfBooks = theBookDirectory2.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toList());

        System.out.println("# elements: " + theResultListOfBooks.size());
        theResultListOfBooks.stream()
                .forEach(System.out::println);

        System.out.println("\n" + "--------------------" + "\n");

        System.out.println(".joining:");
        BookDirectory theBookDirectory3 = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory3.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println(theResultStringOfBooks);


        System.out.println("\n" + "--------------------" + "\n" + "Task 7.3"+ "\n");

        //Task 7.3
        Forum users = new Forum();

        Map<Integer, ForumUser> listUsers = users.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> LocalDate.now().getYear() - forumUser.getBorn().getYear() >= 20)
                .filter(forumUser -> forumUser.getNumberOfPost() <= 1)
                .collect(Collectors.toMap(ForumUser::getId, forumUser -> forumUser));

        listUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);


    }

}

