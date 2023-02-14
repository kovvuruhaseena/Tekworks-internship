import java.util.Scanner;
class maximum
{
  public static void main(String arg[])
    {
     int a,b,c;
     Scanner s=new Scanner(System.in);
     a=s.nextInt();
     b=s.nextInt();
     c=s.nextInt();
     if(a>b && a>c)
       System.out.println("a is maximum"+a);
      else if(b>a && b>c)
       System.out.println("b is maximum"+b);
      else
       System.out.println("c is maximum"+c);
    }
  }