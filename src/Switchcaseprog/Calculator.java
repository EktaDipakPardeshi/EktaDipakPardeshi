package Switchcaseprog;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);      
      int a = 10,b = 12,c;

    	  System.out.println("Enter First no");
    	  
    	  System.out.println("Enter Second no");

          int num=sc.nextInt();

          switch(num)
          {
          case 1:
        	  System.out.println("add");
        	  c=a+b;
    	  break;
          case 2:
        	  System.out.println("sub");
        	  c=a-b;
    	  break;
          case 3:
    		  System.out.println("mul");
    		  c=a*b;
    	  break;
          case 4:
    		  System.out.println("div");
    		  c=a/b;
    	  break;
    	  default:
    		  System.out.println("wrong input");
    	  
      }
          sc.close();
	}

}
