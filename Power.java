package guvi;
import java.util.Scanner;
public class Power {
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int a=s.nextInt(),b=s.nextInt(),c=0;
		c=(int)Math.pow(a,b);
		System.out.println(c);
		s.close();
	}
}
