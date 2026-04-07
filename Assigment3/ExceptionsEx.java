package Assigment3;
/*
    try / catch / finally
You are writing a simple division calculator. 
It must handle invalid inputs gracefully and always print a closing message.
Your Tasks:
Write a method double divide(int a, int b) that divides a by b and returns the 
result as a double. Wrap the division in a try block.
Catch ArithmeticException (division by zero) — print "Error: Cannot divide by zero." and 
return 0.0.
Add a finally block that always prints "--- Operation complete ---" regardless of 
success or failure.
In main, call divide(10, 2) and print the result. Then call divide(5, 0) and print 
the result.
Also demonstrate catching a NumberFormatException: try to parse the String "abc" as an 
integer using Integer.parseInt(). Catch the exception and print "Error: Invalid number format."
Expected Output (sample)
Result: 5.0
--- Operation complete ---
Error: Cannot divide by zero.
--- Operation complete ---
Result: 0.0
Error: Invalid number format.

*/
class Calculations{

    public double divide(int a, int b) {
        try {
           return (double) a / b;
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
            return 0.0;
        } finally {
            System.out.println("--- Operation complete ---");
        }
        
    }

}
public class ExceptionsEx {
    public static void main(String args[]){
        Calculations objCal=new Calculations();
        
        
            System.out.println("Result: "+objCal.divide(10,2));
            System.out.println("Result: "+objCal.divide(5,0));
        
        
        
    }
    
}
