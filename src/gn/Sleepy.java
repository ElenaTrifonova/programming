package gn;
import gn.Gnomes; 

public class Sleepy implements Gnomes{
	private int age;
	private String ty;

    public Sleepy(int age, String ty){
        this.age = age;
        this.ty = ty;
    }
    

    @Override
    public void say(){
       System.out.printf("%s%s%s","- Let me sleep... - said ", getTy(), ".");
       System.out.println("\n");
    }

	@Override	
	public void move(){
       System.out.println("And he continued to sleep");
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
		return  getTy() + " " + getAge() + '\n';
	}
}
