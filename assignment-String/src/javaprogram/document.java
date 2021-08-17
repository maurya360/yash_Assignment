package javaprogram;
import org.json.simple.JSONObject;

public class document {
	String title;
	String filepath;
	
	public void getname()
	{
		
	}
	public void setname(String title, String filepath)
	{
		this.title=title;
		this.filepath=filepath;
	}
	public String showDocumentInformation() 
	{
		System.out.println(this.filepath);
		JSONObject obj=new JSONObject();
		return this.filepath;
		
	}
	
	
	public static void main(String[] args) {
		document ss=new document();
		ss.setname("java_basics", "c:/document/corejava/basics/introduction.pdf");
		//JSONObject obj=new JSONObject(); 
		//ss.showDocumentInformation() ;
		
			
		}

	
	
}
