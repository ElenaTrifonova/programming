package locs;
import locs.Location.*;

public class Stone extends SideGallery {
	public Stone(int w, int h){
		super(w, h);
	}
	
	@Override
	public void describe(){
		System.out.println("It is just stone side gallery.");
	}

}
