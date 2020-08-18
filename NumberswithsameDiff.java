class NumberswithsameDiff
{
	public static void main(String[] args) {
		String op="";
		int n=3;
		int k=7;
		helper(op,n,k);
	}
	static void helper(String op,int n,int k)
	{
		if(n==0 )
		{
			System.out.println(op);
			return;
		}
		for(int i=1;i<=9;i++){
	
		if(i+k<10)
		{  int d=i+k;
			String op1=op+d;
			helper(op1,n-1,k);
		}
		if(i-k>=0)
		{ int c=i-k;
			String op2=op+c;
			helper(op2,n-1,k);
		}
	}
}
}