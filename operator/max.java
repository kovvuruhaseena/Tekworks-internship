import java.util.Scanner;
class max
{
  public static void main(String arg[])
    {
     int a,b;
     Scanner s=new Scanner(System.in);
     a=s.nextInt();
     b=s.nextInt();
     if(a>b)
       System.out.println("a is maximum"+a);
      else
       System.out.println("b is maximum"+a);
    }
  }