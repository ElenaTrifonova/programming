package locs;

public abstract class Location{
	protected int w;
	protected int h;

	public Location (int w, int h){
		this.w = w;
		this.h = h;
	}

	public abstract void describe();
	public abstract void ruin();
}