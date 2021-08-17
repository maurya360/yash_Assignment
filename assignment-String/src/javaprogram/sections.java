package javaprogram;
import org.json.simple.*;
import java.util.HashMap;  
import java.util.Map;  

public class sections {
	private String name;
	private int id;
	private String ndata;
	
	sections(String name,int id, String ndata)
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
		
		sections st=new sections("core_java",1234,"31-01-2017");
		String name= st.getData();
		int id=st.getid();
		String ndata=st.getData();
		Map<String, Comparable> dr=new HashMap<String, Comparable>();
		dr.put("employee name:",name);
		dr.put("emp id",id);
		dr.put("employee date:",ndata);
		String jsonText = JSONValue.toJSONString(dr); 
		System.out.println(jsonText);
//		System.out.println("employee name:" + name);
//		System.out.println("employee name:" + id);
//		System.out.println("employee name:" + ndata);
		
		}

}
