package guvi;
import java.util.Scanner;
public class Alphabats {
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		char y=s.next().charAt(0);
		char x=Character.toLowerCase(y);
		if((x>='a')&&(x<='z'))
		{
			if((x=='a')||(x=='e')||(x=='i')||(x=='o')||(x=='u'))
			{
				System.out.println("Vowel");
			}
			else
			{
				System.out.println("Consonant");
			}
		}
		else
		{
			System.out.println("Invalid");
		}
		s.close();
	}
}
