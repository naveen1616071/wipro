package guvi;

import java.util.Scanner;

public class Multiples_5 {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int mul=s.nextInt();
		int ans=1;
		for(int i=1;i<=5;i++)
		{
			ans=mul*i;
			System.out.print(ans+" ");
		}
		s.close();
	}

}
