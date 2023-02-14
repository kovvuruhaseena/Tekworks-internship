import java.util.Scanner;
class leap year
{
  public static void main(String arg[])
    {
     int num;
     Scanner s=new Scanner(System.in);
     num=s.nextInt();
     if(num%100==0 && num%400==0)
       System.out.println("num is leap year");
    else if(num%4==0 && num%!=0)
       System.out.println("num is leap year");
    else
       System.out.println("num is not a leap year");
    }
  }