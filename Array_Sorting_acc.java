package guvi;

import java.util.Scanner;

public class Array_Sorting_acc {

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
		for(int l:arr)
		{
			System.out.print(l+" ");
		}
		s.close();
	}

}
