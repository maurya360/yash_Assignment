package regularexpression;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		
		        int a[] = { 1, 8, 3, 5, 9, 10 };
		 
		       
		        int b[] = Arrays.copyOfRange(a, 0, 6);
		       
		        System.out.println("Contents of a[] ");
		        for (int i = 0; i < a.length; i++)
		            System.out.print(a[i] + " ");
		 
		        System.out.println("\n\nContents of b[] ");
		        for (int i = b.length-1; i >=0; i--)
		            System.out.print(b[i] + " ");
		    }

	}

