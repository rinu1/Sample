package learning;

public class Countdigits {

	public static void main(String[] args) {
		int n=23456756;
		int count=0;
	while(n>0)
	{
		count++;//5
		n=n/10;//23456756/10=2345675;
	}
	System.out.println(count);

	}

}
