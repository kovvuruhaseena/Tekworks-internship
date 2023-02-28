import java.util.*;
class  Sortarray
  {
    public static void sort(int arr[],int n)
    {
      System.out.println("Sorted array is:");
       for (int i = 0; i < n; i++) 
       {
            for (int j = i + 1; j <n; j++) 
            {
                if (arr[i] < arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
       }
         for(int k=0;k<=n;k++)
           {
             System.out.println(arr[k]);
           }
    }
    public static void main(String[] arg)
    {
    Scanner s=new Scanner(System.in);
      System.out.print("enter the size:");
    int n=s.nextInt();
    int array[]=new int[n];
      System.out.print("enter the array elemnts:");
    for(int i=0;i<array.length;i++)
      {
        array[i]=s.nextInt();
      }
    sort(array,n);
    }
  }
  
