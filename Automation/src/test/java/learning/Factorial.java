package learning;

public class Factorial {

	public static void main(String[] args) {
		//4!=4*3*2*1
		int n=9;
		int fact=1;
		while(n>0)
		{
			fact=fact*n;
			n=n-1;	
		}
		System.out.println(fact);

	}

}
