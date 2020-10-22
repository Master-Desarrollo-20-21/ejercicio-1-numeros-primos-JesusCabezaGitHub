public class PrimeNumber {
	public static void main(String[] args) {
		long sumPrimeNumbers = 2;
		for (int i = 2; i < 50; i++) {
			int divider = 2;
			boolean isPrime = true;
			do {
				if(i % divider == 0) {
					isPrime = false;
				}
				divider++;
			} while (isPrime && divider < i);
			if(isPrime) {
				sumPrimeNumbers+=i;
			}
		}
		System.out.println("The sum of prime numbers to 50 is " + sumPrimeNumbers);
		
		/////////////////////////////////////
		int counterPrimeNumber = 0;
		long sumFirst50PrimeNumbers = 2;
		int number = 3;
		do {
			int divider = 2;
			boolean isPrime = true;
			do {
				if(number % divider == 0) {
					isPrime = false;
				}
				divider++;
			} while (isPrime && divider < number);
			if(isPrime) {
				sumFirst50PrimeNumbers+=number;
				counterPrimeNumber++;
			}
			number++;
		} while (counterPrimeNumber < 50);
		System.out.println("The sum of the firts 50 prime numbers is " + sumFirst50PrimeNumbers);
	}
}
