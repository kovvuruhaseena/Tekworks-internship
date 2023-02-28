public class Palindrome 
{
	static String isPalindrome(String a) 
  {
		int flag=0;
		for(int i=0;i<a.length()/2;i++)
		{
			if (a.charAt(i)==a.charAt(a.length()-1-i))
				flag=1;
			else {
				flag=0;
				break;
			}
		}
		if (flag==1) 
			return "It is a palindrome";
		
		else
			return "It is not a palindrome";
	}
	
	  public static void  main(String []args)
  {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(isPalindrome(s));
	}
}