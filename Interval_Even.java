package guvi;
import java.util.Scanner;
public class Interval_Even {
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int a=s.nextInt(),b=s.nextInt();
		for(int i=a+1;i<b;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}
		s.close();
	}
}
