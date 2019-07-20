package guvi;
import java.util.Scanner;
public class ArraySum {
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		int m=s.nextInt(),index=0;
		for(int j=0;j<a.length;j++)
		{
			if(m==a[j])
			{
				index=j;
			}
		}
		int sum=0;
		for(int k=0;k<=index;k++)
		{
			sum+=a[k];
		}
		System.out.println(sum);
		s.close();
	}
}
