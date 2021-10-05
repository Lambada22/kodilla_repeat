package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.reference.FunctionalStyling;

public class StreamMain {
    public static void main(String[] args) {
        System.out.println("Welcome to module 7 -Stream");
//        SaySomething saySomething= new SaySomething();
//        saySomething.say();

//        Processor processor = new Processor();
//        ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
//        processor.execute(executeSaySomething);
        //Processor processor = new Processor();
        //Executor codeToExecute = () -> System.out.println("This is an example text.");
        //processor.execute(() -> System.out.println("This is an example text."));
//        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
//
//        System.out.println("Calculating  expressions with lambdas: ");
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);
//
//        System.out.println("Calculating expressions with method references: ");
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::suBFromA);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        System.out.println();
        String myPoem123= "XYZabc";

        poemBeautifier.beautify("Me dzieciństwo sielskie, anielskie! ",
                myPoem -> myPoem.toUpperCase());
        System.out.println(poemBeautifier);

        poemBeautifier.beautify(myPoem123,myPoem1 -> myPoem1.substring(1,5));

        poemBeautifier.beautify("Komu bije dzwon? ", FunctionalStyling::withABC);
        poemBeautifier.beautify("Było nas trzech",FunctionalStyling::anotherStyle);
    }
}
