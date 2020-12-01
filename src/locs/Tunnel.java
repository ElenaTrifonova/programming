package locs;
import locs.Location;
import feel.Time;

public class Tunnel extends Location{

  public Tunnel(int w, int h){
  	super(w, h);
  }
  
  public int getWidth(){
  	return w;
  }

   public int getHeight(){
  	return h;
  }

  public void describe(){
   System.out.println("People in the tunnel.");
   System.out.println("\n");
  }
  public void descript(long r){
     
     if (r<1){
    	System.out.printf("%s%d%s%d","Width of tunnel: ", getWidth(), " Height of tunnel: ", getHeight());
      System.out.println("\n");
    }
    else if ((r>=1) && (r<=90)){
    	System.out.printf("%s%d%s%d","Width of tunnel: ", getWidth() , " Height of tunnel: ", getHeight()-1);
      System.out.println("\n");
      h = h - 1;
      
    }
    else {
      System.out.printf("%s%d%s%d","Width of tunnel: ", getWidth()-1 , " Height of tunnel: ", getHeight()-2);   
      System.out.println("\n");   
      w = w - 1; 
      h = h - 1; 
    }
	}

  public void ruin(){
    System.out.println("The wall collapsed, the way back is blocked.\n");

  }
}
