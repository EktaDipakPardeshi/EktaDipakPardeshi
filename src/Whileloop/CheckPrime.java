package Whileloop;

public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=10;
boolean flag=true;
for(int i=2;i<=num/2;i++)
{
while(num%i==0)
{
	flag=false;
	break;
}
	
if(flag)
	System.out.println("num is prime");
else
	System.out.println("num is not prime");
	}
	}
}
