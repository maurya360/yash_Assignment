class Fibonacci 
{
	public static void main(String args[])
	{
	 	int n1=1,n2=1,sum=0,num=6;
		while(num<=0)
		{
		sum=n1+n2;
		n1=n2;
		n2=sum;
		System.out.print(sum);
		}
		

	}
}