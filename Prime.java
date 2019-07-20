package guvi;
import java.util.Scanner;
public class Prime {
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		int count=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==0)
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
