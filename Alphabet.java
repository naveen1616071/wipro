package guvi;
import java.util.Scanner;
public class Alphabet {
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		char y=s.next().charAt(0);
		char x=Character.toLowerCase(y);
		if((x>='a')&&(x<='z'))
		{
			System.out.println("Alphabet");
		}
		else
		{
			System.out.println("No");
		}
		s.close();
	}
}

