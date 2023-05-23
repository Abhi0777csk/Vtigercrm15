import java.util.Scanner;
class Spy_Number
{
 public static void main(String[]args)
{
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter The Number");
 int num=sc.nextInt();
 int a=0;
 int b=1;
 while(num>0)
{
 int rem=num%10;
 a=a+rem;
 b=b*rem;
 num=num/10;
}
 System.out.println("sum is:"+a);
 /*while(num>=1)
{
 int c=num%10;
 b=b*c;
 num=num/10;
}*/
 System.out.println("mul is:"+b);
 if(a==b)
{
 System.out.println("It Is Spy Number");
 return;
}
 System.out.println("It Is Not Spy Number");
}
}