package Assigment3;
/*
throw & throws
A voting registration system needs to validate that a person meets the age requirement 
before registering them.
Your Tasks:
Create a custom exception class called UnderAgeException that extends Exception. 
Its constructor should accept a String message and pass it to super().

Write a method void registerVoter(String name, int age) throws UnderAgeException that: 
prints "Registered: <name>" if age >= 18, OR throws new UnderAgeException("<name> is 
too young. Age: <age>") if age < 18.

In main, call registerVoter() inside a try-catch block for three people: 
"Alice" age 22 
(valid), "Bob" age 16 (should throw), "Carol" age 18 (valid).

Catch UnderAgeException and print the exception message.
Print "Registration process completed." after the try-catch block.

Expected Output (sample)
Registered: Alice
UnderAgeException: Bob is too young. Age: 16
Registered: Carol
Registration process completed.

*/
class UnderAgeException extends Exception{
    UnderAgeException(String msg){
        super(msg);
    }

}
public class ThrowsEx {
    public static void main(String args[]){
        String[] names = {"Alice", "Bob", "Carol"};
        int[] ages = {22, 16, 18};
        for (int i = 0; i < names.length; i++) {
        try{
            registerVoter(names[i],ages[i]);
           
            
        }catch(UnderAgeException UGE){
            System.out.println(UGE);
        }
    }
    
            System.out.println("Registration process completed.");

    }

    public static void registerVoter(String name, int age) throws UnderAgeException{
        if(age<18){
            throw new UnderAgeException(name+ " is too young. Age: "+age);      
        }
        System.out.println("Registered: "+name);
    } 


    public static void registerVoter1(String name, int age) {
        try{
        if(age<18){
            throw new UnderAgeException(name+ " is too young. Age: "+age);      
        }
        System.out.println("Registered: "+name);
    }catch(UnderAgeException UGE){
            System.out.println(UGE);
        }
        
    } 
    
}
