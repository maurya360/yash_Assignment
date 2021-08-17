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
	

}
