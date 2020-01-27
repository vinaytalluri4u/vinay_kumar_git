import java.util.*;
class P3
{
public static void main(String[] args)
{
int[][] a=new int[3][3];
int k=0;
int i,j,max=0;
//System.out.println(args.length);
if(args.length<=8)
{
System.out.println("Please enter 9 integer numbers");
}
else
{
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
a[i][j]=Integer.parseInt(args[k]);
if(a[i][j]>max)
max=a[i][j];
k++;
}
}
System.out.println("The given array is:");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println();
}
System.out.println();
System.out.print("The biggest number in the array is:");
System.out.println(max);
}
}
}
