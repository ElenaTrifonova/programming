package persons;


import persons.Person;
import feel.Time;

public class Professor extends Person {

	public Professor(String name, int age, String sex, String type){
		super(name, age, sex, type);
	}

	@Override
	public void saySomething(){
		System.out.printf("%s%s%s","-They have picks!!!!!!, - screamed loudly ", getName(), ".");
		System.out.println("\n");
	}

	public void returnStudent(){
		System.out.printf("%s%s%s","-Come to me immediately!, - exclaimed  ", getType(), ".");
		System.out.println("\n");
	}

	public void saySmell(long r){

    if (r<2){
    	System.out.printf("%s%s%s","-What a pungent smell! - mentioned ", getType(), ".");
    	System.out.println("\n");
    }
    else {
    	System.out.printf("%s%s%s","-Pungent smell intensified, - said ", getName(), ".");
    	System.out.println("\n");
    }
	}
}
