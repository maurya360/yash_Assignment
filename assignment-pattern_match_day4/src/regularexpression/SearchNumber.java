package regularexpression;

import java.util.Scanner;

public class SearchNumber {

	public static void main(String[] args) {
		int counter, num, item, array[],count = 0;
	     
	      Scanner input = new Scanner(System.in);
	      System.out.println("Enter number of elements:");
	      num = input.nextInt(); 
	      
	      array = new int[num]; 
	      System.out.println("Enter " + num + " integers");
	     
	      for (counter = 0; counter < num; counter++)
	        array[counter] = input.nextInt();

	      System.out.println("Enter the search value:");
	      item = input.nextInt();
	     // input.close();

	      for (counter = 0; counter < num; counter++)
	      {
	         if (array[counter] == item) 
	         {
	           //System.out.println(item+" is present at location "+(counter+1));
	          
	            count=count+1;
	         }
	      }
	      if (counter == num)
	        System.out.println(item + " appears in the array "+count+" times");
	   }
		

}
