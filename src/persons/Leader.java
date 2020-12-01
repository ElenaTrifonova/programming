package persons;

import persons.Person;
import clo.*;

public class Leader extends Person{

	public Leader(String name, int age, String sex, String type){
		super(name, age, sex, type);
	}

	@Override
	public void saySomething(){
		System.out.printf("%s%s%s","-Go strictly straight!, - said ", getName(), ".");
		System.out.println("\n");
		}
	public void chooseWay(){
		double y = Math.random()*3 + 1;
		int x = (int) y ;
		if (x == 1){
			System.out.printf("%s%s%s","-Turn left, - said  ", getName(), ".");
			System.out.println("\n");
		}
		else if (x == 2){
			System.out.printf("%s%s%s","-Turn right, - ordered ", getName(), ".");
			System.out.println("\n");
		}
		else {
			System.out.printf("%s%s%s","-Hurry up! Don't turh anywhere, - said ", getName(), ".");
			System.out.println("\n");
		}
	}
	public void throww(){
		System.out.printf("%s%s",getType(), " threw of his coat.\n");
		Coat cl1 = new Coat("fur", "coat");
		cl1.change();
	}
}
