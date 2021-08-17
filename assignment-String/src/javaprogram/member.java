package javaprogram;

public class member {
	private String firstname;
	private String lastname;
	private String email;
	private String password;
	private String role;
	
	member(String firstname,String lasttname,String email,String password,String role )
	{
		this.firstname= firstname;
		this.lastname= lastname;
		this.email= email;
	}
	public String getData()
	{
		return firstname;
			
	}

	
}
