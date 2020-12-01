import clo.*;
import gn.*;
import pen.*;
import locs.*;
import persons.*;
import feel.*;



public class Main{
	public static void main(String args[]){

                System.out.println("Day of week: " +DayOfWeek.WEDNESDAY.getTitle());
                System.out.println("\n");

		Student st = new Student("Dima", 18, "male", "student");
		Leader le = new Leader("Victor", 35, "male", "leader");
		Professor pr = new Professor("Sergey Vasilevich", 27, "male", "professor");
		Scientist sc = new Scientist("Ivan", 25, "male", "scientist");

		System.out.println(st.toString());
		System.out.println(le.toString());
		System.out.println(pr.toString());
		System.out.println(sc.toString());
        Time  t = new Time();
        long start = System.currentTimeMillis();
        long r = t.mainn(start);
        t.mov(r);
        

        Tunnel tu = new Tunnel(6, 5);
        tu.descript(r);

        Temperature temp = new Temperature();
        temp.increase(r);

        le.saySomething();
        pr.saySmell(r);
        st.comeIntoGallery();

        Gold g = new Gold(5, 5);
        g.describe();
        st.saySomething("gold");
        pr.returnStudent();
        
        long r2 = t.mainn(start);
        t.mov(r2);
       
        temp.increase(r2);

        le.chooseWay();
        tu.descript(r2);
        Coat c = new Coat("мех", "куртка");
        c.temp();

        Adult ad1 = new Adult(1, "adult","male", "pink");
        Adult ad2 = new Adult(2, "adult","male", "green");
        Adult ad3 = new Adult(3, "adult", "male", "yellow");
        ad3.run();

        System.out.println(ad1.toString());
        System.out.println(ad2.toString());
        System.out.println(ad3.toString());
        
        sc.saySomething();
        ad1.bump();
        tu.ruin();
        
        long r3 = t.mainn(start);
        t.mov(r3);
        
        Sound s1 = new Sound();
        s1.one();
        s1.depictt("громко");
        le.chooseWay();
        tu.descript(r3);
        pr.saySmell(r3);
        st.comeIntoGallery();

        Stone s = new Stone(5, 5);
        s.describe();
        st.saySomething("stone");
        pr.returnStudent();

        long r4 = t.mainn(start);
        t.mov(r4);
        
        temp.depict();
        temp.increase(r4);
        le.throww();
        Coat c1 = new Coat("fur", "coat");
        System.out.println(c1.toString());
        c1.change();
        Sound s2 = new Sound();
        s2.two();
        s2.depictt("тихо");

        Brilliant s3 = new Brilliant(5, 5);
        s3.forGn();

        Grumbler gn1 = new Grumbler(36, "Grumbler");
        Sleepy gn2 = new Sleepy(35, "Sleepy");
        Worker gn3 = new Worker(34, "Worker");
        System.out.println(gn1.toString());
        System.out.println(gn2.toString());
        System.out.println(gn3.toString());

        gn3.say();
        gn3.move();

        gn2.say();
        gn2.move();

        gn1.say();
        gn1.move();

        tu.describe();

        Sweater sw = new Sweater("wool", "sweater");
        Coat c3 = new Coat("fur", "coat");
        
        sw.fall();
        c3.fall();
        sw.cut();
        c3.cut();
        System.out.println("Check that it is ruined coat on the groun with equals(if false then things are not the same): ");
        System.out.println(c3.equals(c));

        Baby b = new Baby(1, "baby", "female", "pink");
        b.run();
        System.out.println(b.toString());
        sc.saySomething();
        b.hide();

        
        long r5 = t.mainn(start);
        t.depict();
        t.mov(r5);
        
        le.chooseWay();
        tu.descript(r5);
        st.see();
        pr.saySomething();

        Underground un = new Underground(1, 1);
        un.describe();
        System.out.println(un.toString());




	}
}
