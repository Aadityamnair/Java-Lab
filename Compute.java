import java.io.*;
import java.util.Scanner;
class Test
{
void calculate(int n,char ch)
{
if(ch=='s')
{
System.out.println(n*n);
}
else
{
System.out.println(n*n*n);
}
}
void calculate(int n,int m,char ch)
{
if(ch=='p')
{
System.out.println(n*m);
}
else
{
int s=n+m;
System.out.println(s);
}
}
void calculate(String str1,String str2)
{
if(str1.equals(str2)==true)
{
System.out.println("Strings are equal");
}
else
{
System.out.println("Strings are not equal");
}
}
}
class Compute
{
public static void main(String args[])
{
Test obj=new Test();
int n,m;
char ch;
String data;
Scanner sc=new Scanner(System.in);
Scanner sc1=new Scanner(System.in);
System.out.println("Enter the number:");
n=sc.nextInt(); 
System.out.println("Enter the choice:");
data=sc1.nextLine();
ch=data.charAt(0);

Scanner a=new Scanner(System.in);
System.out.println("Enter the first integer:");
n=sc.nextInt();
System.out.println("Enter the second integer:");
m=sc.nextInt();
System.out.println("Enter the choice:\n");
data=a.nextLine();
ch=data.charAt(0);
Scanner sc2=new Scanner(System.in);
System.out.println("Enter the first string:");
String str1=sc2.nextLine();
System.out.println("Enter the second string:");
String str2=sc2.nextLine();
obj.calculate(n,ch);
obj.calculate(n,m,ch);
obj.calculate(str1,str2);
}
}


