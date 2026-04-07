package Assigment3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
Stream API — sorted, reduce, count, findFirst
Continue working with the same employee data. Now use terminal and sorting operations 
to extract insights.
Your Tasks:
Use the same salaries list from Q10: 
[25000, 42000, 15000, 68000, 31000, 72000, 19000, 55000].
Use stream().sorted() to print salaries in ascending order. Then use 
sorted(Comparator.reverseOrder()) for descending order.
Use stream().reduce(0, Integer::sum) to calculate the total of all salaries. 
Print the result.
Use stream().count() to count how many salaries are above 40000.
Use stream().filter().findFirst() to find the first salary greater than 60000. Use orElse(-1) to handle the case where none is found. Print the result.
Use stream().mapToInt(Integer::intValue).average() to calculate and print the average salary. Use orElse(0) to safely unwrap the OptionalDouble.

Expected Output (sample)
Ascending: [15000, 19000, 25000, 31000, 42000, 55000, 68000, 72000]
Descending: [72000, 68000, 55000, 42000, 31000, 25000, 19000, 15000]
Total salary: 327000
Count above 40000: 4
First salary > 60000: 68000
Average salary: 40875.0
*/
public class StreamAPIEx {
    public static void main(String args[]){
        List<Integer> empSalaries=new ArrayList<>(Arrays.asList(25000, 42000, 15000, 68000, 31000, 72000, 19000, 55000));
        Collections.sort(empSalaries);
        System.out.println("Ascending: "+ empSalaries.stream().sorted().toList());
        System.out.println("Descending: "+empSalaries.stream().sorted(Comparator.reverseOrder()).toList());           
        System.out.println("Total salary: "+empSalaries.stream().reduce(0,(c,e)->c+e));
        System.out.println("Count above 40000: "+empSalaries.stream().filter(n->n>40000).count());
        System.out.println("First salary > 60000: "+empSalaries.stream().filter(n->n>60000).findFirst());       
        System.out.println("Average salary: "+empSalaries.stream().reduce(0,(c,e)->c+e)/empSalaries.size());                  
    }
    
}
