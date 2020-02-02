/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
class Parent
{
     String name="parent class variable";
}
class Child extends Parent
{
    void print()
    {
        System.out.println(name);
    }
}
class P61
{
	public static void main(String[] args) {
	 Child c1=new Child();
	 c1.print();
		
	}
}
