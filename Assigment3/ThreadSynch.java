package Assigment3;
/*
Synchronization
A cinema ticket booking system has multiple counters selling the same seats. 
Without proper synchronization, two counters might sell the same seat.
Your Tasks:
Create a class TicketCounter with a private int availableSeats = 10.
Add a synchronized method boolean bookSeat(String counterName) that: 
if availableSeats > 0, decrements availableSeats, prints "<counterName> booked a seat. 
Remaining: <n>" and returns true. Otherwise prints "<counterName>: No seats available!" 
and returns false.
In main, create one TicketCounter object. Create three threads (Counter-A, Counter-B, Counter-C) using lambda expressions. Each thread calls bookSeat() in a loop 4 times with a short Thread.sleep(50) between bookings.
Start all three threads and join them all.
After all threads finish, print "Booking closed. Seats remaining: <n>"
Expected Output (sample)
Counter-A booked a seat. Remaining: 9
Counter-B booked a seat. Remaining: 8
Counter-C booked a seat. Remaining: 7
... (10 successful bookings across all counters) ...
Counter-A: No seats available!
Counter-B: No seats available!
Booking closed. Seats remaining: 0

*/
class TicketCounter{
    private int availableSeats = 10;

    public synchronized boolean bookSeat(String counterName){
        if (availableSeats > 0){
            availableSeats--;
            System.out.println(counterName+ " booked a seat. Remaining: "+availableSeats);
            return true;
        } else{
            System.out.println(counterName+ ": No seats available!");
            return false;
        }
        
    }

    public int getAvailableSeats(){
        return availableSeats;
    }

}
public class ThreadSynch {
    
    public static void main(String args[]){
        TicketCounter objTicketCounter=new TicketCounter();
        Runnable R1=()->{
            for(int i=1;i<=4;i++){
                objTicketCounter.bookSeat("Counter-A");
                try{
                    Thread.sleep(50);
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }
            }

        };

        Runnable R2=()->{
            for(int i=1;i<=4;i++){
                objTicketCounter.bookSeat("Counter-B");
                try{
                    Thread.sleep(50);
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }
            }

        };

        Runnable R3=()->{
            for(int i=1;i<=4;i++){
                objTicketCounter.bookSeat("Counter-C");
                try{
                    Thread.sleep(50);
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }
            }

        };

        Thread t1=new Thread(R1);
        Thread t2=new Thread(R2);
        Thread t3=new Thread(R3);

        t1.start();
        t2.start();
        t3.start();
        try{
            t1.join();
            t2.join();
            t3.join();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        

        System.out.println("Booking closed. Seats remaining: "+objTicketCounter.getAvailableSeats());
    }
    
}
