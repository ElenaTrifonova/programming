package pen;
import pen.Penguin;

public class Adult extends Penguin {
    static int countPen=0;
	public Adult(int number, String age, String sex, String color){
		super(number, age, sex, color);
        countPen += 1;
	}
    
    @Override
    public void run(){
    	if (countPen==1){
    	    System.out.printf("Only one penguin is running by people.");
            System.out.println("\n");
        }
        else if ((countPen>1) && (countPen<5)){
            System.out.printf("%s%d","A few penguins are running by people. Sum: ", countPen );
            System.out.println("\n");
        }
        else {
        	System.out.printf("%s%d","Lots of penguins are running by people. Sum: ", countPen );
            System.out.println("\n");
        }
    }

	public void bump(){
		System.out.printf("%s%d%s","Penguin number ",getNumber()," touched a stone wall.\n");
        System.out.println("\n");
	}
}
