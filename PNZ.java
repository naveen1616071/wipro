package guvi;
import java.util.Scanner;
public class PNZ {
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		if(n==0)
		{
			System.out.println("Zero");
		}
		else if(n<0)
		{
			System.out.println("Negative");
		}
		else
		{
			System.out.println("Positive");
		}
		s.close();
	}
}
