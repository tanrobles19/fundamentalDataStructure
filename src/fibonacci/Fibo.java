package fibonacci;

public class Fibo {

	public static void main(String[] args) {
		System.out.println(fibo(20));
	}
	
	public static int fibo(int n) {
		System.out.println(n);
		if(n <= 1) {
			return n;
		}else {
			return fibo(n-1) + fibo(n -2);
		}
			
	}

}
