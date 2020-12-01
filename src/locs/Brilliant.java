package locs;
import locs.Location.*;


public class Brilliant extends SideGallery {
	public Brilliant(int w, int h){
		super(w, h);
	}
	@Override
	public void describe(){
		System.out.println("It is brilliant gallery.");
	}

	public void forGn(){
        System.out.println("Gnomes are in the briliant gallery at the same time.");
	}
}
