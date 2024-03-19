import java.util.Scanner;
public class SuperPrime{
	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static boolean superPrime(int n){
		
		while (n > 0) {
			if (!isPrime(n)) {
				return false;
			}else {
				n /= 10;
			}
		}
		return true;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			if(superPrime(n)) {
				System.out.print("True");
			}else {
				System.out.print("False");
			}
		}
	
}