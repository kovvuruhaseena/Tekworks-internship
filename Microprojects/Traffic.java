import java.util.*;
class Traffic
  {
    public static void main(String args[])
    {
      System.out.println("enter traffic time");
     Scanner s=new Scanner(System.in);
     int time=s.nextInt();
      traffic(time);    
    }
    public static void traffic(int time)
    {
      if(time>=1 && time=<10)
      {
        System.out.println("traffic light is yelloe");
      }
      else if(time>10 && time<=20)
      {
        System.out.println("traffic light is green");
      }
      else
      {
        System.out.println("traffic light is red ");
      }
    }
  }