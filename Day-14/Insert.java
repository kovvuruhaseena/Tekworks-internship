import java.util.*;
class Insert{
   static void insert(int org[],int size,int pos,int ele)
  {
    int dup[]=new int[size+1];
    for(int i=0;i<size+1;i++){
      if(i<pos-1)
          dup[i]=org[i];
      else if(i==pos-1)
          dup[i]=ele;
      else
           dup[i]=org[i-1];
    }
    System.out.println(Arrays.toString(dup));
  
  }
    public static void main(String arg[])
    {
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int array[]=new int[n];
      for(int i=0;i<n;i++)
        array[i]=s.nextInt();
      int pos=s.nextInt();
      int ele=s.nextInt();
      insert(array,n,pos,ele);
    }
  }