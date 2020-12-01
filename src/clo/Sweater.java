package clo;
import clo.Clothes;

public class Sweater extends Clothes{

	public Sweater(String m, String t){
        super(m, t);
    }

    @Override
    public void fall(){
      System.out.println("Abandoned sweaters are lying on the ground.");
    }

    @Override
    public void cut(){
      System.out.println("The sweaters have slits.");
    }

}
