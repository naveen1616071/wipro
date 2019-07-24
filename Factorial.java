package guvi;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int f=s.nextInt();
		int fac=1;
		for(int i=1;i<=f;i++)
		{
			fac=fac*i;
		}
		System.out.println(fac);
		s.close();
	}

}
