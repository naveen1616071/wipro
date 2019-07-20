package guvi;
import java.util.Scanner;
public class Leap_Year {
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int y=s.nextInt();
		if(y%4==0)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		s.close();
	}
}
