import java.util.Scanner;
import java.lang.*;
class Switch
{
 public static void main(String [] args)
 { int i = 1;
  do{
  int x;
  Scanner obj = new Scanner(System.in);
  System.out.println("Enter no 1 to 7 for see weakdays and if you want to exit press 8");
  x = obj.nextInt();
  switch(x)
  {
   case 1:
       System.out.println("monday");
	break;
   case 2:
       System.out.println("tuesday");
	break;
   case 3:
       System.out.println("wednesday");
	break;
   case 4:
       System.out.println("thursday");
	break;
   case 5:
       System.out.println("friday");
	break;
   case 6:
       System.out.println("saturday");
	break;
   case 7:
       System.out.println("sunday");
	break;
   case 8:
	System.out.println("Bye Bye");
	System.exit(0);
   default:
	System.out.println("press valid choice");
        break;
   }
/*
    switch(x)
  {
   case 1:
       //System.out.println("monday");
	
   case 2:
       //System.out.println("tuesday");
	
   case 3:
       //System.out.println("wednesday");
	
   case 4:
       //System.out.println("thursday");
	
   case 5:
       //System.out.println("friday");
	System.out.println("weakday");
	break;
   case 6:
       //System.out.println("saturday");
	
   case 7:
       //System.out.println("sunday");
       System.out.println("weakend");
	break;
   case 8:
	System.out.println("Bye Bye");
	System.exit(0);
   default:
	System.out.println("please enter valid input");
        break;
   }
*/  
}while(i==1);
 
  }
}
