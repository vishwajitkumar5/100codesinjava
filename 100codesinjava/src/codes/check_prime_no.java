package codes;
import java.util.*;
public class check_prime_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int n=sc.nextInt();
    for(int i=2;i<n-1;i++) {
    	if(n%i==0)
    	{
    		temp=temp+1;
    	}
    }
    if(temp>0)
    {
    	System.out.println("Not prime number");
    	
    }
    else
    	System.out.println("prime number");
	}

}
