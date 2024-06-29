package week1.day1;

public class Fibonocci {

	public  int fibofn(int N) 
	{
	int n1=0;
	int n2=1;
	
	for (int i=1;i<N;i++)
	{
		System.out.println(n1 );
		int sum= n1+n2;
		n1=n2;
		n2=sum;
	}
	return N;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fibonocci obj= new Fibonocci();
		obj.fibofn(8);

	}

}
