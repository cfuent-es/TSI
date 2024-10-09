//ThreadEx.java
public class ThreadEx {
   public static void main(String[] args) {
      SleepyThread thrd1 = new SleepyThread("Thrd#1"),
    		       thrd2 = new SleepyThread("Thrd#2"),
    		       thrd3 = new SleepyThread("Thrd#3"),
    		       thrd4 = new SleepyThread("Thrd#4"),
    		       thrd5 = new SleepyThread("Thrd#5");
      
      System.out.println("******Iniciando Threads dorminhocas...");	
      thrd1.start();
      thrd2.start();
      thrd3.start();
      thrd4.start();
      thrd5.start();
      System.out.println("*****Todas Threads iniciadas...");
	}
}
class SleepyThread extends Thread {
   private int sleepTime;
   public SleepyThread (String name){
	   setName(name);
	   // randomly sleeps between 0 and 5 minutes
	   sleepTime = (int) (Math.random()* 300000);   
	   System.out.format("%s criada. Vai dormir %5.2f segundos\n", 
                         getName(), 
			             (float)(sleepTime/1000));
   }
   public void run(){
      try {
         System.out.format("%s indo dormir!\n", getName());
         Thread.sleep(sleepTime);
      }catch (InterruptedException exception){
    	 System.err.println(exception.toString()); 
      }
      System.out.format("%s acordou.\n", getName());
   }	
}
