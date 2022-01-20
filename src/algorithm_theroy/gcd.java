package algorithm_theroy;

public class gcd {

	static int DIV = 100;
	
	public static void main(String[] args) {

		int a = (int) (Math.random() * Integer.MAX_VALUE % DIV);
		int b = (int) (Math.random() * Integer.MAX_VALUE % DIV);
		
		System.out.println("a = "+ a+ ", b = "+b);
		System.out.println("gcd = "+gcd(a, b));
	}

	private static int gcd(int A, int B) {
		return B!=0?gcd(B, A%B):A;
	}

}
