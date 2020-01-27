import java.util.*;
class Box
{
int height;
int width;
double depth;
void setvalues(int height,int width,double depth)
{
this.height=height;
this.width=width;
this.depth=depth;
}
double volume()
{
return height*width*depth;
}
}
class P4
{
public static void main(String[] args)
{
Box b1=new Box();
b1.setvalues(3,2,2.4675);
System.out.println(b1.volume());
}
}
