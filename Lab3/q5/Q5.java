package com.R177219048.q5;
import java.util.*;
public class Q5 {
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		int mrk[]=new int[10];
		String grade[]=new String[10];
		int temp=0;
		System.out.println("Enter the marks of students");
		for(int i=0;i<10;i++)
			mrk[i]=sc.nextInt();
		
		for(int i=0;i<10;i++) 
		{
			for(int j=i+1;j<10;j++) 
			{
				if(mrk[i]>mrk[j])
				{
					temp=mrk[i];
					mrk[i]=mrk[j];
					mrk[j]=temp;
				}
			}
		}
		
		System.out.println("Marks in Ascending Order: ");
		for(int i=0;i<10;i++) 
			System.out.print(mrk[i]+"	");
		System.out.println();
		
		for(int i=0;i<10;i++) {
			if(mrk[i]>=40 && mrk[i]<=50)
				grade[i]="PASS";
			else if(mrk[i]>=51 && mrk[i]<=75)
				grade[i]="MERIT";
			else if(mrk[i]>75)
				grade[i]="DISTINCTION";
		}
		
		System.out.println("TABULAR FORM");
		System.out.println("Marks"+"		"+"Grades");
		for(int i=0;i<10;i++)
			System.out.println(mrk[i]+"			"+grade[i]);
		sc.close();
	}
}
