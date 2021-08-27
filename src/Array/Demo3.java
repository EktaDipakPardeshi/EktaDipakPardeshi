package Array;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo3[] arr=new Demo3[5];
Scanner sc=new Scanner(System.in);
System.out.println("enter id,name,percent");
int id=sc.nextInt();
String nm=sc.next();
float per=sc.nextInt();
for(int i=0;i<=arr.length;i++)
{
	arr[i]=new Demo3(id,name,percent);
}
System.out.println();
}
}
