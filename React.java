class React
{
 public static void main(String c[])
 {
 Reactangle obj = new Reactangle();
 obj.getdata(12,6);
 System.out.print("Area of  the Reactangle is =");
 obj.Area();
 }
}


 class Reactangle
 {
  int a,b;
   void getdata(int x,int y)
   {
     a = x;
     b = y;
   }
 void Area()
  {
  int c;
  c = a*b;
  System.out.println(c);

  }
 }
