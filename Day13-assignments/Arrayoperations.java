import java.util.*;
class Arrayoperations
  {
    public static void main(String arg[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("enter number of elements in an array");
      int size=s.nextInt();
      int array[]=new int[size];
      System.out.println("which of the following operation do you want to perform");
      int option=s.nextInt();
      switch(option)
        {
          case 1: InsertAtfirstIndex (array,size);
                  break;
          case 2: InsertAtlastIndex(array,size);
                  break;
          case 3: InsertAtspecifiedIndex(array,size);
                  break;
          case 4: RemoveAtfirstIndex(array,size);
                  break;
          case 5:RemoveAtlastIndex(array,size);
                  break;
          case 6:RemoveAtspecifiedIndex(array,size);
                  break;
          case 7: RemoveAtuserenetedelement(array,size);
                  break;
          case 8: DisplayallinASC(array,size);
                  break;
        }
    }
     static void InsertAtfirstIndex(int array[],int size)
        {
        System.out.println("enter element to insert at first index");
        Scanner s=new Scanner(System.in);
        System.out.println("enter an element to insert");
        int element=s.nextInt();
        array[0]=element;
        System.out.println(Arrays.toString(array));
        }
      static void InsertAtlastIndex(int array[],int size)
        {
        System.out.println("enter element to insert at last index");
          Scanner s=new Scanner(System.in);
        int element=s.nextInt();
        array[size-1]=element;
        System.out.println(Arrays.toString(array));
        }
      static void InsertAtspecifiedIndex(int []array,int size)
        {
        System.out.println("enter position no to insert data");
        Scanner s=new Scanner(System.in);
        int position=s.nextInt();
        }
      static void RemoveAtfirstIndex(int []array,int size)
        {
        System.out.println("enter element to remove at first index");
        array[0]=0;
        }
      static void RemoveAtlastIndex(int []array,int size)
        {
        System.out.println("enter element to remove at last index");
        array[0]=0;
        }
      static void RemoveAtspecifiedIndex(int[] array,int size)
      {
       System.out.println("enter position number") ;
      }
    static void RemoveAtuserenetedelement(int[] array,int size){
      
    }
    static void DisplayallinASC(int[] array,int size){
      
    }
      
    }
  
  