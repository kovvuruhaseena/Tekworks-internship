import java.util.*;
class Leapyear
  {
    public static void main(String arg[])
    {
      int yearnumber;
      Scanner s=new Scanner(System.in);
      System.out.println("enter the yearnumber");
      yearnumber=s.nextInt();
      if(yearnumber%100==0 && yearnumber%400==0)
      {
        System.out.println("year is a leap year");
      }
      else if(yearnumber%4==0 && yearnumber%100!=0)
      {
        System.out.println("year is a leap year");
      }
      else
      {
        System.out.println("year is not a leap year");
      } 
    }
  }