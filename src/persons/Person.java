package persons;

public class Person{
	protected int age;
	protected String sex;
	protected String name;
	protected String type;

	public Person(String name, int age, String sex, String type){
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.type = type;
	}
	public void saySomething(){
		System.out.println("Something");
	}
	public void saySomething(String x){
		System.out.println("Something");
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
	public String getSex(){
		return sex;
	}
	public void setSex(String sex){
		this.sex = sex;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getType(){
		return type;
	}
	public void setType(String type){
		this.type = type;
	}	

	@Override
	public String toString(){
		System.out.println("Information about members: ");
		return getName() + ' ' + getAge() + ' ' + getSex() + ' ' + getType() + '\n';
	}
}	
