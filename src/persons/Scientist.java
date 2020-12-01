package persons;

import persons.Person;


public class Scientist extends Person{
	public Scientist(String name, int age, String sex, String type){
		super(name, age, sex, type);
	}

	@Override
	public void saySomething(){
		System.out.printf("%s%s%s","-Penguins! - exclaimed ",getType() ," and ran after them.");
		System.out.println("\n");
	}

}
