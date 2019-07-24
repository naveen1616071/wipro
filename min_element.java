package guvi;

import java.util.Scanner;

public class min_element {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		for(int k=0;k<n;k++)
		{
			for(int j=k+1;j<n;j++)
			{
				if(arr[k]>arr[j])
				{
					int temp=arr[j];
					arr[j]=arr[k];
					arr[k]=temp;
				}
			}
		}
		System.out.println(arr[0]);
		s.close();
	}

}
