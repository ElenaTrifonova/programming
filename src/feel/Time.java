package feel; 

import java.util.Date; 
import feel.Feelings;  

public class Time implements Feelings{
   public long r = 0;

 	@Override
    public void depict() {
        System.out.println("Time is running\n");
    }
  
  public void mov(long r){
    System.out.printf("%s%d%s","Time since entering the tunnel:", r, " milliseconds.");
    System.out.println("\n");        
  }


  public long mainn(long start){
    long r = System.currentTimeMillis() - start;
    return r;
  }

}