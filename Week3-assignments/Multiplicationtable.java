import java.util.*;
class Multiplicationtable
{
public static void multiplicationTable(int num,int i,int range)
{
while(i<=range)
{
System.out.println(num +"*" + i + "=" num*i);
i++;
}
}
public static void main(String arg[])
{
int num;
int i=1;
  int range;
Scanner s=new Scanner(System.in);
System.out.println("enter the num");
num=s.nextInt();
System.out.println("enter range");
range=s.nextInt();
multiplicationTable(num,i,range);
}
}