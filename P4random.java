import java.util.*;
class RandomHelper
{
    static int randint()
    {
        return ((int)(10.0*Math.random()));
    }
    static double randdouble()
    {
        return (10.0*Math.random());
    }
}
public class P4random
{
	public static void main(String[] args) {
		System.out.println(RandomHelper.randint());
	    System.out.println(RandomHelper.randdouble());
	    
	}
	
}
