package gn;
import gn.Gnomes; 

public class Worker implements Gnomes{
	private int age;
	private String ty;

	public Worker(int age, String ty){
        this.age = age;
        this.ty = ty;
    }
    


	@Override
    public void say(){
      System.out.printf("%s%s%s","- Don't stop working!!! - screamed", getTy(), ".");
      System.out.println("\n");
    }

	@Override
	public void move(){
      System.out.println("He hit the wall with a pick. Brilliants fell.");
	}

	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
    public String getTy(){
		return ty;
	}
	public void setTy(String ty){
		this.ty = ty;
	}

	@Override
	public String toString(){
		System.out.println("Information about gnomes: ");
		return  getTy() + ' ' + getAge() + '\n';
	}
	
}
