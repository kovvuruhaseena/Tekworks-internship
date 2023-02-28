import java.util.*;
class Product
  {
    public static void product(int m)
    {
      int n;
      int p=1;
      while(m>0)
        {
          n=m%10;
          p=p*n;
          m=m/10;
        }
      System.out.println("product of the digits is:"+p);
      }
    public static void main(String arg[])
    {
      int m;
      Scanner s=new Scanner(System.in);
      System.out.println("enter the number");
      m=s.nextInt();
      product(m);
    }
  }