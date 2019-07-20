package guvi;
import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int n=s.nextInt(),rem=0,sum=0,t=n;
		while(n>0)
		{
			rem=n%10;
			sum=sum*10+rem;
			n/=10;
		}
		if(t==sum)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		s.close();
	}
}
