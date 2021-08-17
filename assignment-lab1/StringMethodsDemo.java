public class StringMethodsDemo {
	public static void main(String[] args) {
		String targetString = "Java is fun to learn";
		String s1= "JAVA";
		String s2= "Java";
		String s3 = " Hello Java ";
		
		System.out.println(targetString.charAt(2));
		System.out.println(targetString.concat("Enjoy"));
		System.out.println(s2.equalsIgnoreCase(s1));
		System.out.println(s2.equals(s1));
		System.out.println(targetString.length());
		System.out.println(targetString.replace("fun", "easy"));
		System.out.println(targetString.substring(8));
		System.out.println(targetString.substring(8, 12));
		System.out.println(targetString.toLowerCase());
		System.out.println(targetString.toUpperCase());
		System.out.println(s3.trim());
		System.out.println(targetString.contains(s1));
		System.out.println(targetString.contains(s2));

		char [] charArray = s2.toCharArray();
		System.out.println("Size of char array: " + charArray.length);
		System.out.println("Printing last element of array: " + charArray[3]);

	}

}
