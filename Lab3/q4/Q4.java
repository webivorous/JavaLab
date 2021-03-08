package com.R177219048.q4;

public class Q4 {

	public static void main(String[] args) {
		
		int sum=0;
		for(int i=41;i<250;i++)
		{
			if(i%5==0)
				sum=sum+i;
		}
		System.out.println("Sum= "+sum);
	}

}

