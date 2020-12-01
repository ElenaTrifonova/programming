package locs;
import locs.Location;
import feel.Time;

public class SideGallery extends Location {
   
	public SideGallery(int w, int h){
		super(w, h);
	}
    
    public int getWidth(){
    	return w;
    }

    public int getHeight(){
    	return h;
    }
    
    public void ruin(){
    System.out.println("The wall collapsed.");
   }
   
   public void describe(){
   System.out.println("Some");
   }

	@Override
	public String toString(){
		System.out.println("Сведения о галерее: ");
		return getClass() + " width: " + getWidth() + " meters   Height: " + getHeight() + " meters";
	}	
}
