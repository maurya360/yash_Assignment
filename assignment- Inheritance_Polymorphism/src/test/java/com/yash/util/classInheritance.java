package com.oops;

/**
//		 * this program shows inheritance of first second and third string 
		 * @author kushagra.sharma
		 *
		 */

		class first {
		    String a = "Kushagra";
		    void dofirst() {
		        System.out.println("this line is " + a);
		    }
			
		}
		class second extends first {
		    String b = "Sharma";
		    void dosecond() {
		        System.out.println("this line is " + b);
		    }
		}
		class third extends second {
		    String c = "Indore";
		    void dofirst() {
		        System.out.println("1:says");
		    }
		    void dosecond() {
		        System.out.println("2:says");
		    }
		    void dothird() {
		        System.out.println("this line is " + a + " " + b + " " + c);
		    }
		}
		public class classInheritance   //main class
		{ 
		    public static void main(String[] args) {
		        first a = new first();
		        second b = new second();
		        third c = new third();

		        a.a = "first";
		        b.a = "second's first";
		        b.b = "second";
		        c.a = "::1 by 3::";
		        c.b = "::2 by 3::";
		        c.c = "third";

		        a.dofirst();
		        b.dosecond();
		        c.dofirst();
		        c.dosecond();
		        c.dothird();
		    }
		}
