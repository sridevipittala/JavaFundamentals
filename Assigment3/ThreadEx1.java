package Assigment3;
/*
    A news app downloads articles from three different sources at the same time 
    to reduce waiting time.
Your Tasks:
Create a class NewsDownloader that implements Runnable. 
Its constructor takes a String sourceName and an int delaySeconds.
In run(), print "Downloading from: <sourceName>...", 
sleep for delaySeconds * 1000 milliseconds, 
then print "<sourceName> download complete!".
In main, create three Thread objects
 using NewsDownloader: "BBC" (2 sec), "CNN" (1 sec), "Reuters" (3 sec).
  Give each a name using setName().
Start all three threads.
Use join() on all three threads so that main waits for all to finish.
After all threads finish, print "All articles downloaded. App is ready!"
Expected Output (sample)
Downloading from: BBC...
Downloading from: CNN...
Downloading from: Reuters...
CNN download complete! (after ~1 sec)
BBC download complete! (after ~2 sec)
Reuters download complete! (after ~3 sec)
All articles downloaded. App is ready!

*/
class NewsDownloader implements Runnable{
    
    String sourceName ;
    int delaySeconds;

    NewsDownloader(String sourceName ,int delaySeconds){
        this.sourceName=sourceName;
        this.delaySeconds=delaySeconds;
    }
    public void run(){
        System.out.println("Downloading from: "+ sourceName + "...");
        try{
            Thread.sleep(delaySeconds*1000);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(sourceName +" download completed!\"");
    }
}
public class ThreadEx1 {
    public static void main(String args[]){
      
            Thread t1=new Thread(new NewsDownloader("BBC" ,2));
            Thread t2=new Thread(new NewsDownloader("CNN" ,1));
            Thread t3=new Thread(new NewsDownloader("Reuters" ,3));

            t1.setName("BBC");
            t2.setName("CNN");
            t3.setName("Reuters");

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
            System.out.println("All articles downloaded. App is ready!");
    }
    
}
