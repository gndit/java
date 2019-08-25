import java.util.Scanner;
class ForLoop
{
 public static void main(String a[])
 {
int b,i;
 Scanner ob = new Scanner(System.in);
 System.out.println("Enter any no");
 b = ob.nextInt();
for(i=0;i<=b;i++)
 {
  System.out.print("qube of the " + i );
System.out.println(" is =" + i*i*i);
}


 } 
}
