package feel;

import feel.Feelings;

public class  Temperature implements Feelings {

	@Override
    public void depict() {
        System.out.println("There have been some change in the enviroment.");
    }

	public void increase(long r){

	    if ((r>=0) && (r<=5)){
	    	System.out.println("Temperature is cool.");
	    }
        else if ((r>5) && (r<=90)){
        	System.out.println("Temperature has slighty increased.");
        }
        else {
        	System.out.println("Temperature continued to rise.");
        }
	}
}
