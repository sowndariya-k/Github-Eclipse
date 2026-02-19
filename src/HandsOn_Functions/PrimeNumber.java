package HandsOn_Functions;

public class PrimeNumber {

	public static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		// math.sqrt(num) or num/2
		for (int i = 2; i <= (num / 2); i++) {
			if (num % i == 0) {
				return false;// divisible , not a prime
			}
		}
		return true;// not divisible, prime number
	}

	public static void main(String[] args) {
		System.out.println("Prime numbers between 1-100: ");
		for (int i = 1; i <= 100; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}
	}

}
