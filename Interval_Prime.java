package guvi;
import java.util.Scanner;
public class Interval_Prime {
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int a=s.nextInt(),b=s.nextInt(),count=0;
		for(int i=a+1;i<b;i++)
		{
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==0)
			{
				System.out.println(i);
			}
			count=0;
		}
		s.close();
	}
}
