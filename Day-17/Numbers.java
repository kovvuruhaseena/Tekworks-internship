import java.util.*;

class Numbers 
{
  public static booleanprime(int n) 
  {
    for (int i = 2; i < n; i++)
      {
      if (n % i == 0)
      {
        return false;
      }
    }
    return true;
  }

  public static void displayarray(int arr[],int s)
    {
      int a=0,b=0,c=0,d=0,e=0;
      for(int i=0;i<=s-1;i++)
        {
          if(arr[i]<0)
          {
            a++;
          }
          else if(arr[i]>0 && arr[i]%2==0)
            {
            b++;
            }
          else if(arr[i]>0 && arr[i]%2!=0) 
            {
            c++;
            }
          else if(arr[i]>0 && primegenerator(arr[i]))
            {
            d++;
            }
              else
          {
            e++;
          }
        }
        System.out.println(a+b+c+d+e);
         System.out.println("positive numbers are:"+b);
       System.out.println("even numbers are:"+c);
       System.out.println("odd numbers are:"+d);
       System.out.println("prime numbers are:"+e);
       
    }
    

  public static void main(String[] ar)
  {
    Scanner s = new Scanner(System.in);
    System.out.print("enter the array size:");
    int arraysize = s.nextInt();
    int array[] = new int[arraysize];
    System.out.print("enter the array elemnts:");
    for (int i = 0; i < array.length; i++)
      {
      array[i] = s.nextInt();
       }
    displayarray(array, arraysize);
    
  }
}