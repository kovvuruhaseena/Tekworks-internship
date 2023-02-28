import java.util.*;
class Primenumber
  {
    public static void isPrime(int n)
    {
		 if(n==1)
			 System.out.println("false");
		 else if(n==2)
			 System.out.println("true");
		 else
     {
			 for(int i=2;i<=n/2;i++)
         {
				 if (n%i==0)
         {
					 System.out.println("false");
				 }
			 }
			 System.out.println("true");
	 }
  }
	 
	public static void main(String args[] )
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter range of prime numbers ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		for(int i=a;i<=b;i++) 
    {
			if(isPrime(i))
				System.out.println(i);
		}
		
	}
      
    }