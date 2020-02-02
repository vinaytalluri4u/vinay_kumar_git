/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
class Person
{
     String name;
     Person(String name)
     {
        this.name=name;
     }
}
class Employee extends Person
{
    double annualsalary;
    int startyear;
    String insuranceno;
    Employee(String name,double annualsalary,int startyear,String insuranceno)
    {
    super(name);
    this.annualsalary=annualsalary;
    this.startyear=startyear;
    this.insuranceno=insuranceno;
    }
    void print()
    {
        System.out.println(name+" "+annualsalary+" "+startyear+" "+insuranceno);
    }
}
class P62
{
	public static void main(String[] args) {
	 Employee e1=new Employee("ravi",500000.0,2000,"123456789");
	 e1.print();
		
	}
}
