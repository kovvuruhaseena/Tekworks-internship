import java.util.*;
class Electricitybill
  {
    public static void main(String args[])
    {
      int a,b;
  System.out.println("Previous units");
     Scanner s=new Scanner(System.in);
      a=s.nextInt();
  System.out.println("Current units");
      b=s.nextInt();
      electricity(a,b);
    }
    public static void electricity(int a,int b)
    {
    double units=a+b;
    double result=0;
    System.out.println("Total units: "+units);
       if(units<=50)
		{
		  result=units*0.50;
		  
		}
	  else if(units>50 && units<=150)
        {
		  result=units*0.75;
		    }
      else if(units>150 && units<=250)
		    {
		  result=units*1.20;
		    }
      else
		    {
		  result=units*1.50;
		    }
      double gst=result*20/100; 
      double elect_bill=gst+result;
      System.out.println("total elect_bill: "+elect_bill);
    }
  }