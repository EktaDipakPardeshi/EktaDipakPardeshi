package forloop;


public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int n=5,f=1;
      for(int i=1;i<=n;i++)
      {
    	  f=2;
    	  for(int j=1;j<=i;j++)
    	  {
    	  f=f*i;
      }
      System.out.println(f);
      
      
	}

	}
}
