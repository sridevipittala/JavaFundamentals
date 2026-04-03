/*
ArrayList
You are building a simple to-do list app. The app stores tasks as Strings in an ArrayList and supports basic management operations.
Your Tasks:
Create an ArrayList<String> called tasks. Add five tasks to it: "Buy groceries", "Read a book", "Exercise", "Call mom", "Pay bills".
Print all tasks using a for-each loop, with a number before each task (1. Buy groceries, 2. Read a book, ...).
Remove the task "Exercise" by value, then remove the task at index 0.
Check whether "Pay bills" is still in the list using contains() and print: "Pay bills present: true/false".
Add a new task "Study Java" at index 1.
Print the final list and its size.
Expected Output (sample)
Buy groceries 2. Read a book 3. Exercise 4. Call mom 5. Pay bills
After removals and additions:
Read a book 2. Study Java 3. Call mom 4. Pay bills
Pay bills present: true
List size: 4
*/
import java.util.ArrayList;
class ToDoList {
    public static void main(String[] args) {
        ArrayList<String> tasks=new ArrayList<>();
        tasks.add("Buy groceries");
        tasks.add("Read a book");
        tasks.add("Exercise");
        tasks.add("Call mom");
        tasks.add("Pay bills");
        for(int i=0;i<tasks.size();i++){
            System.out.print((i+1)+". "+tasks.get(i)
        +" ");
        }
        tasks.remove("Exercise");
        tasks.remove(0);
        System.out.println("\nAfter removals and additions:");
        
       
        tasks.add(1,"Study Java");
        for(int i=0;i<tasks.size();i++){
            System.out.print((i+1)+". "+tasks.get(i)
        +" ");
         
        }
        boolean isPaybills=tasks.contains("Pay bills");
        System.out.println("\nPay bills present: "+isPaybills);
        System.out.println("List size: "+tasks.size());
}
}