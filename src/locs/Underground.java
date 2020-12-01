package locs;
import locs.Location;
import feel.Feelings;

public class Underground extends Location {
	
	public Underground(int w, int h){
		super(w, h);
	}

    public int getWidth(){
    	return w;
    }

    public int getHeight(){
    	return h;
    }

    public void ruin(){
    System.out.println("Sand fell from the ceiling.");

  }
   public void describe(){
   System.out.println("People ran fast to the nearest underground.");
   }


	@Override
	public String toString(){
		System.out.println("Information about underground: ");
		return getClass() + " width: " + getWidth() + " meters   height: " + getHeight() + " meters";
	}	
}
