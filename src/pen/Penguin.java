package pen;

public class Penguin{
    static int countPen=0;
	protected int number;
	protected String  color;
	protected String  sex;
	protected String  age; // adult||baby

    public Penguin(int number, String age, String sex, String color){
        this.number=number;
    	this.age = age;
		this.sex = sex;
		this.color = color;
		countPen += 1;
    }

    public void run(){
    	System.out.println("Some");
    }
    public int getNumber(){
		return number;
	}
	public void setNumber(int number){
		this.number = number;
	}
    public String getAge(){
		return age;
	}
	public void setAge(String age){
		this.age = age;
	}
	public String getSex(){
		return sex;
	}
	public void setSex(String sex){
		this.sex = sex;
	}
	public String getColor(){
		return color;
	}
	public void setName(String color){
		this.color = color;
	}

    @Override
	public String toString(){
		System.out.println("Information about penguins: ");
		return "number" + getNumber() + ' ' + getAge() + ' ' + getSex() + ' ' + getColor() + '\n';
	}
}