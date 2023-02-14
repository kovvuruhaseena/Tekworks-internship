import java.util.Scanner;
class student
  {
    public static void main(String arg[])
    {
      int num;String name;int p;int m;int c;float avg;
      Scanner s=new Scanner(System.in);
      num=s.nextInt();
      name=s.next();
      p=s.nextInt();
      m=s.nextInt();
      c=s.nextInt();
      avg=p+m+c/3;
      System.out.println("num is "+num);
      System.out.println("name is "+name);
      System.out.println("avg is "+avg);
    }
  }