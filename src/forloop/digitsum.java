package forloop;

public class digitsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int num=1234,sum=0;
for(int i=num;i>0;i=i/10)
{
	 sum = sum+i%10;
	System.out.println(i);
}
	}

}
