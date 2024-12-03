public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int primeCounter = 0;

        System.out.println("Prime numbers up to " + n + ":");
        
        for (int i = 2; i <= n; i++){
            if (isPrime(i)){
                primeCounter++;
            }
        }
        double primePercent =  ((double) primeCounter/n) * 100;
        System.out.println("There are " + primeCounter + " primes between 2 and " + n + ". (" + (int) primePercent + "% are primes)");
    }

    public static boolean isPrime (int n){
        int i = 2;
			while(i <= n/2) {
				if(n % i == 0) {
					return false;
				}
				i++;
			}
            return true;
    }
}