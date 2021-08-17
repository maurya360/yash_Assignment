package javaprogram;



public class demo {

	public static void main(String[] args) {
		section st=new section("core_java",1234,"31-01-2017");
		String name= st.getData();
		int id=st.getid();
		String ndata=st.getData();
		
		System.out.println("employee name:" + name);
		System.out.println("employee name:" + id);
		System.out.println("employee name:" + ndata);
		
		

	}

}
