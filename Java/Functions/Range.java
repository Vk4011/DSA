public class Range {
    public static boolean isPrime(int n){
        boolean isPrime=true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }

        }
        return true;
    }

    public static void primeInRange (int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+"\t ");
            }
        }
        System.out.println("\n\t ");
    }
    
    
    public static void main(String[] args) {
        System.out.println("\n\t print primes in Range... \n");
        primeInRange(20);
    }
}

// output:
//     print primes in Range...

// 2        3       5       7       11      13      17      19      