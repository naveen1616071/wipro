package guvi;

import java.util.Scanner;

public class max_element {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		int max=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		for(int k=0;k<n;k++)
		{
			if(arr[k]>max)
			{
				max=arr[k];
			}
		}
		System.out.println(max);
		s.close();
	}

}
