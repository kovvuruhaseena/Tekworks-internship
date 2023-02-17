import java.util.*;
public class Employeesalary 
{   
	int tax(long sal) {
		if (sal<300000)
		{
			return 0 ; 
    }  
		else if(sal<600000) 
    {
			return 5;
    }
		else if (sal<900000)
    {
			return 10;
		}
		else if (sal<1200000)
    {
			return 15;
		}
		else 
    {
			return 20;
		}
	}
	    
	 public static void main(String[] args)
  {    
		 Scanner s=new Scanner(System.in);
		 Employeesalary obj=new Employeesalary();
		 long a=s.nextLong();
		 int taxPercentage=obj.tax(a);
		 long taxAmount=(a*taxPercentage)/100;
		 System.out.println("annual salary is  "+a);
		 System.out.println("the tax amount is  "+taxAmount);
		 System.out.println("The netsalary   is "+(a-taxAmount));
		
	}
  
}