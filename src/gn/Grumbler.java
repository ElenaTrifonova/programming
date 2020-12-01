package gn;

import gn.Gnomes; 

public class Grumbler implements Gnomes{
	private int age;
	private String ty;
    
    public Grumbler(int age, String ty){
        this.age = age;
        this.ty = ty;
    }

	@Override
	public void say(){
      System.out.printf("%s%s%s","- I could now rest in the Maldives instead of that! - whispered ", getTy(), ".");
      System.out.println("\n");
	}

	@Override
	public void move(){
      System.out.println("He looked around the gallery hopelessly.");
      System.out.println("\n");
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
