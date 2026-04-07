package Assigment3;
/*
    Functional Interfaces
You are building a mini data processing utility using Java's built-in functional 
interfaces to keep the code clean and flexible.
Your Tasks:

Use Predicate<Integer> to create: isEven (returns true if the number is even) and 
isGreaterThan50 (returns true if number > 50). Test both with values 48 and 72. 
Also combine them using .and() — print whether 72 is both even AND greater than 50.

Use Function<String, String> to create addGreeting that prepends "Hello, " to a name 
and appends "!". Apply it to "Alice" and "Bob" and print results.

Use Consumer<String> to create a printUpperCase that prints the string in uppercase. 
Accept a List of ["java", "streams", "lambda"] and forEach() with this Consumer.

Use Supplier<Double> called randomScore that returns Math.random() * 100. 
Call it 3 times and print each result.

Expected Output (sample)
48 is even: true 48 > 50: false
72 is even: true 72 > 50: true
72 is even AND > 50: true
Hello, Alice! Hello, Bob!
JAVA STREAMS LAMBDA
Score 1: 67.32 Score 2: 41.88 Score 3: 93.15 (values will vary)

*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Functionalinter {
    public static void main(String args[]){
     
        Predicate<Integer> isEven=a->a%2==0 ;
        Predicate<Integer> isGreaterThan50=a->a>50 ;
        Predicate<Integer> isEvenGreaterThan50=isEven.and(isGreaterThan50);
        System.out.println("48 is even: "+isEven.test(48)+"48 > 50: "+isGreaterThan50.test(48));
        System.out.println("72 is even: "+isEven.test(72)+"72 > 50: "+isGreaterThan50.test(72));
        System.out.println("72 is even AND > 50: "+isEvenGreaterThan50.test(+72));
        
        Function<String, String> addGreeting=(name)->"Hello, " +name+"!";
        System.out.println(addGreeting.apply("Alice") +" " +addGreeting.apply("Bob")); 
         
        //Consumer<String> printUpperCase=s->System.out.print(s.toUpperCase());
        List<String> concepts=new ArrayList<>(Arrays.asList("java", "streams", "lambda"));                
        concepts.forEach(s->System.out.print(s.toUpperCase()+" "));
        System.out.println("");
        Supplier<Double>  randomScore=()->((int)(Math.random() * 100)) / 100.0;
        System.out.println("Score 1: "+randomScore.get()+" Score 2: "+randomScore.get()
        +" Score 3"+randomScore.get());
     
    }
    
}
