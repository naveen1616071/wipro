package guvi;
import java.util.Scanner;
public class amstrong_no {
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int n=s.nextInt(),sum=0,rem=0,count=0,t=n,z=0,c=n;
		while(t>0)
		{
			t/=10;
			count+=1;
		}
		while(n>0)
		{
			rem=n%10;
			z=(int)Math.pow(rem,count);
			sum+=z;
			n/=10;
		}
		if(sum==c)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("no");
		}
		s.close();
	}
}
