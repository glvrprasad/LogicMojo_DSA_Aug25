package mojo;

public class Basic {
	
	public static void main(String[] args) {
		int a = 60;
		int b = 36;
		System.out.println(findGCD(a,b));
		System.out.println(findGCDUsingIterations(a,b));
		System.out.println(isPrime(a));
		System.out.println(isPrimeUsingSqrt(b));
	}

	private static boolean isPrimeUsingSqrt(int a) {
		for(int i = 2;i<Math.sqrt(a);i++) {
			if(a%i == 0) {
				return false;
			}
		}
		return true;
	}

	private static boolean isPrime(int a) {
		
		for(int i =2;i<a;i++) {
			if(a%i == 0) {
				return false;
			}
		}
		
		return true;
	}

	private static int findGCDUsingIterations(int a, int b) {
		 int n = Math.min(a,b);
		    int max = 1;
			
			/*
			 * while(n >0) { if(a%n ==0 && b%n==0) { break; } n--; }
			 */
		    for(int i = n;i >0;i--) {
		    	if(a%i ==0 && b%i==0) {
		    		max = i;
		    		break;
		    	}
		    }
		    return max;
	}

	private static int findGCD(int a, int b) {
		if(b==0) {
			return a;
		}
		return findGCD(b,a%b);
	}

}

