package regularexpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordRegularExpression {

	public static void main(String[] args) {
		//Scanner in = new Scanner(System.in);
		//System.out.print("Enter Passwod: ");
		String s = "A2sdervy1";
		//in.close();
		
	
		if(isValid(s))
			System.out.println("Valid number");
		else
			System.out.println("InValid number");
	}
	
	public  static boolean isValid(String s)
	{
		Pattern p = Pattern.compile("[A-S][02468][a-z A-z 0-9 $#]*(1)");
		Matcher m =p.matcher(s);
		return (m.find());
		
	}

}


