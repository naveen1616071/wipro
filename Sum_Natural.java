package guvi;
import java.util.Scanner;
public class Sum_Natural {
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int a=s.nextInt(),sum=0;
		for(int i=1;i<=a;i++)
		{
			sum+=i;
		}
		System.out.println(sum);		
		s.close();
	}
}
