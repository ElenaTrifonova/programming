package pen;
import pen.Penguin;

public class Baby extends Penguin {
   static int countPen=0;
	public Baby(int number, String age, String sex, String color){
		super(number, age, sex, color);
        countPen += 1;
	}

    @Override
	public void run(){
    	if (countPen==1){
    	    System.out.println("Only one little penguin is running by people.");
            System.out.println("\n");
        }
        else if ((countPen>1) && (countPen<5)){
            System.out.printf("%s%d","A few little penguins are running by people. Sum: ", countPen );
            System.out.println("\n");
        }
        else {
        	System.out.printf("%s%d","Lots of little penguins are running by people. Sum: ", countPen );
            System.out.println("\n");
        }
    }

	public void hide(){
		System.out.printf("%s%d%s","Penguin number ", getNumber() ," hid.\n");
        System.out.println("\n");
	}
}
