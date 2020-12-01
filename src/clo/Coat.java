package clo;

import clo.Clothes;

public class Coat extends Clothes{

	public Coat(String m, String t){
        super(m, t);
    }

    @Override
    public void fall(){
      System.out.println("Crumpled coats are next to them.");
    }

    @Override
    public void cut(){
      System.out.println("Coats have them too.");
    }

}
