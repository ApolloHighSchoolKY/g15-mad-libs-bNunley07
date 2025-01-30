
//Import line for using new Random
import java.util.Random;

public class RandomStuff {

    public static void main (String[] args)
    {
    	//Math.random version
    	int x = (int)(Math.random()*50 + 1);

    	System.out.println(x);

    	//new Random version
    	Random rand = new Random();
    	int y = rand.nextInt(50) + 1;

    	System.out.println(y);

		//range -3 -8
		int z = (int)(Math.random()*12-3);

		System.out.println(z);

		//range 12 - 27
		Random randy = new Random();
		int s = randy.nextInt(15) + 13;
		System.out.println(s);
		//System.out.println(rand.nextInt(12)-3);
    }


}