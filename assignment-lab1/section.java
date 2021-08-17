package javaprogram;

public class section {
	private String name;
	private int id;
	private String ndata;
	
	section(String name,int id, String ndata)
	{
		this.id=id;
		this.name=name;
		this.ndata=ndata;
	}
	
	public String getName()
	{
		return name;
	}

	public int getid()
	{
		return id;
	}
	
	public String getData()
	{
		return ndata;
	}



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
