package Assigment3;
/*
Lambda Expressions
You have a list of product names and need to sort and filter them using lambda expressions
 instead of verbose anonymous classes.
Your Tasks:
Create an ArrayList<String> called products with: "Laptop", "Phone", "Tablet", "Monitor", 
"Keyboard", "Mouse", "Headphones".
Sort the list alphabetically using list.sort() with a lambda Comparator. Print the sorted 
list.
Sort the list by length (shortest first) using a lambda. Print the result.

Use a lambda with the Runnable interface: create a Runnable called printTask that prints
 "Processing product list..." on a new Thread. Start the thread.

Use removeIf() with a lambda to remove all products whose name length is less 
than 6 characters. Print the list after removal.

Expected Output (sample)
Alphabetical: [Headphones, Keyboard, Laptop, Monitor, Mouse, Phone, Tablet]
By length: [Phone, Mouse, Laptop, Tablet, Monitor, Keyboard, Headphones]
Processing product list...
After removeIf (length < 6): [Laptop, Tablet, Monitor, Keyboard, Headphones]

 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class LambdaExp {
    public static void main(String args[]){
        ArrayList<String>  products = new ArrayList<>(Arrays.asList("Laptop", "Phone", "Tablet", "Monitor", 
                                                        "Keyboard", "Mouse", "Headphones"));

        //Comparator<String> com=(s1, s2)->s1.compareTo(s2);
        Collections.sort(products,(s1, s2)->s1.compareTo(s2));
        System.out.println("Alphabetical: "+products);

        Collections.sort(products,(s1, s2)->Integer.compare(s1.length(),s2.length()));    
        System.out.println("By length: "+products);


        //Runnable printTask=()-> System.out.println("Processing product list..." );
        Thread t1=new Thread(()-> System.out.println("Processing product list..." ));
        t1.start();
        
        products.removeIf(s->s.length()<4);
           
        System.out.println("After removeIf (length < 6): "+products);
                 
                                                  
    }
    
}
