package guvi;
import java.util.Scanner;
public class Interval_amstrong {
	public static void main(String[] args) {
		int s,n,r,x;
		System.out.println("Enter the range");
		Scanner a=new Scanner(System.in);
		int p=a.nextInt();
		int q=a.nextInt();
		for(n=p;n<=q;n++)
		{
		s=0;
		x=n;
		while(x!=0)
		{
		r=x%10;
		s=s+r*r*r;
		x=x/10;
		}
		if(s==n)
		System.out.println(n);
		}
		a.close();
	}
}