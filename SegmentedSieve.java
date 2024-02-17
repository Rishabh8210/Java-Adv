import java.util.*;
public class SegmentedSieve{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();
        int sqrtHigh = (int)Math.sqrt(high);
        boolean []isPrime = new boolean[sqrtHigh+1];
        isPrime[0] = isPrime[1] = false;
        ArrayList<Integer> primes = new ArrayList<>();
        Arrays.fill(isPrime, true);
        for(int i = 2; i <= sqrtHigh; i++)
        {
            if(isPrime[i] == true)
            {
                primes.add(i);
                for(int j = i*i; j <= sqrtHigh; j += i)
                {
                    isPrime[j] = false;
                }
            }
        }
        boolean []rangePrime = new boolean[high-low+1];
        Arrays.fill(rangePrime, true);
        
        for(int prime : primes)
        {
            int start = (int)Math.ceil((double)low / prime) * prime;
            for(int j = start; j <= high; j += prime)
            {
                rangePrime[j-low] = false;
            }
        }
        
        for(int i = low; i <= high; i++)
        {
            if(rangePrime[i - low])
            {
                System.out.println(i);
            }
        }
    }
}