import java.util.*;
class Gradecalculator
  {
    public static void main(String arg[])
    {
      int m1,m2,m3,phy,che;double per;
      System.out.println("enter m1 marks");
      System.out.println("enter m2 marks");
      System.out.println("enter m3 marks");
      System.out.println("enter phy marks");
      System.out.println("enter che marks");
      Scanner s=new Scanner(System.in);
      m1=s.nextInt();
      m2=s.nextInt();
      m3=s.nextInt();
      phy=s.nextInt();
      che=s.nextInt();
      per=(m1+m2+m3+phy+che/500)*100;
      System.out.println(per);
      if(per>=90)
      {
        System.out.println("grade  A");
      }
      else if(per>=80)
      {
        System.out.println("grade B");
      }
      else if(per>=70)
      {
        System.out.println("grade C");
      }
      else if(per>=60)
      {
        System.out.println("grade D");
      }
      else 
        System.out.println("grade F");
     }
  }
  