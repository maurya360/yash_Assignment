package com.yash.assignment_day5;

import java.util.Scanner;

public class CheckNumber_odd_even_positive_negative {

	public static void main(String[] args) {
	
		int i,x,a[] = new int[5];
		
		int n=0,p=0,e=0,o=0;

		
		Scanner input = new Scanner(System.in);

		
		 System.out.println("Enter Number :");
		for(i=0;i<5;i++)
		{
		
		 a[i] = input.nextInt();
		  
		}
		
		
		for(i=0;i<5;i++)
		{
			if(a[i]<0)
				n++;
			else
				p++;

			x=a[i]%2;
			if(x==0)
				e++;
			else
				o++;
		}
		

		
		System.out.println("Total Even Numbers = "+e);
		System.out.println("Total Odd Numbers = "+o);
		System.out.println("Total Negative Numbers = "+n);
		System.out.println("Total Positive Numbers = "+p);
	}

}

