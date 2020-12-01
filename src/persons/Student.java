package persons;

import persons.Person;


public class Student extends Person {

	public Student(String name, int age, String sex, String type){
		super(name, age, sex, type);
	}

	
	@Override
	public void saySomething(String x){
		if ((x == "stone")||(x == "tunnel")){
			System.out.println("- There is also a terrible smell!, - shouted student.\n");
		}
		else if ((x=="gold")||(x=="brilliant")|| (x=="underground")){
			System.out.printf("%s%s%s","-There is no smell here!, - shouted  ", getName(), ".");
			System.out.println("\n");
		}
	}

	public void see(){
		System.out.println("The expedition members suddenly saw the gnomes.\n");
	}
	public void comeIntoGallery(){
		System.out.printf("%s%s", getName(), " ran into side gallery.\n");
	}
}
