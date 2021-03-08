package com.R177219048.q1;

import java.util.Scanner;
import java.io.IOException;
public class Q1 
{

	public static void main(String[] args) throws IOException
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int [3];
		System.out.println("Enter 3 digits");
		for(int i=0;i<3;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int a=0;a<3;a++)
		{
			for(int b=0;b<3;b++)
			{
				for(int c=0;c<3;c++)
				{
					if (a!=b&&b!=c&&c!=a)
					{
					      System.out.println(arr[a] + "" + arr[b] + "" + arr[c]);
				    }
		 	    }
		     }
	      }
		sc.close();
	 }

}
