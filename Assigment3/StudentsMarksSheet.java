package Assigment3;

import java.util.HashMap;
import java.util.Map;

/*
    HashMap
A teacher wants to store student names and their marks in a data structure that allows fast lookup by name.
Your Tasks:
Create a HashMap<String, Integer> called markSheet. 
Add five entries: Alice→88, Bob→74, Carol→95, David→60, Eva→82.

Print Bob's marks using get(). Then use getOrDefault() to safely 
print the marks of a student named "Frank" (who doesn't exist) — print 0 
if not found.

Update David's marks to 75 using put().
Check if the key "Carol" exists using containsKey() and print the result.
Loop through all entries using entrySet() and print each in the 
format: "Name: Alice Marks: 88".
Print the total number of entries in the map using size().

Expected Output (sample)
Bob's marks: 74
Frank's marks: 0
Carol present: true
Name: Alice Marks: 88
Name: David Marks: 75
Total entries: 5
*/
 class StudentsMarksSheet {
    public static void main(String args[]){
        HashMap<String, Integer>  markSheet=new HashMap<>();
        markSheet.put("Alice",88);
        markSheet.put("Bob",74);
        markSheet.put("Carol",95);
        markSheet.put("David",60);
        markSheet.put("Eva",82);

        System.out.println("Bob's marks: "+markSheet.get("Bob"));
        //System.out.println(markSheet.getOrDefault("Bob",0));

         
        // System.out.println(markSheet.get("Frank"));
        System.out.println("Frank's marks: "+markSheet.getOrDefault("Frank",0));

         markSheet.put("David",75);
         
        System.out.println("Carol present: "+markSheet.containsKey("Carol"));
        for (HashMap.Entry<String, Integer> entry : markSheet.entrySet()) 
            {
                System.out.println("Name: "+entry.getKey()+" Marks: "  +  entry.getValue());
            }

        System.out.println("Total entries: "+markSheet.size()); 
    }
    
}
