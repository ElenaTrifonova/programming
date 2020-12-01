package feel;

import feel.Feelings;

public class Sound implements Feelings {

    private String s;
 
    public Sound(){
        this.s=s;
    }
    
    @Override
    public void depict(){
        System.out.println("There have been climate change.");
    }

    
    public void depictt(String  s) {
        
        if (s == "громко") {
        System.out.println("Sound was a very loud.");
    }
        else if (s == "тихо"){
            System.out.println("Sound was quiet.");
        }
    }
     
    public void one(){
        System.out.println("Grinding was heard.");
    }

    public void two(){
        System.out.println("Hitting the ground was heard.");
    }
    
}   
