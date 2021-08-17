class expression
{
	public static boolean isValid(String str)
	{
		if(str==null || str.length()==0){
		return true; 
	}
	int count=0;
	int i=0;

	while(i<str.length()){
		char ch=str.charAt(i);
		if(ch=='(' || ch=='{'){
			count++;
		}
		else if(ch==')' || ch=='}'){
			if(count==0){
				return false;
		}
		else{
			count--;
			}
		}
		i++;
   	}
	if(count!=0){
		return false;
	}
	return true;
  }

	public static void main(String args[])
	{
		String str="";
		str="AB(CD)}";	
		System.out.println("is vaild "+ isValid(str));



	}
}