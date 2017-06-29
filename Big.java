import java.util.*;
import java.io.*;
public class Big{
public static void main(String[]args){
int f1,f2,f3;
Scanner sc=new Scanner(System.in);
f1=sc.nextInt();
f2=sc.nextInt();
f3=sc.nextInt();
if((f1>f2)&&(f1>f3))
{
System.out.println("f1 is greater");
}
else if(f2>f3)
{
System.out.println("f2 is greater");
}
else
{System.out.println("f3 is greater");}
}
}
