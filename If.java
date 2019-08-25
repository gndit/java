import java.util.Scanner;
class If
 { 
   public static void main(String ar[])
	{
    int x;
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter any no ");
    x = obj.nextInt();
    if(x%2==0)
     {
	System.out.println("Even no");
      }
     else
	{
	System.out.println("odd no");

	}
    System.out.println("Bye");	
   }
}
