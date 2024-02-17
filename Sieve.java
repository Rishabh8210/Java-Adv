// Prime algo - Sieve, Segmented Sieve - Optimal 
import java.util.*;
public class Sieve {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt(); 
        boolean primes[] = new boolean[size+1];
        primes[0] = primes[1] = false;
        for(int i = 2; i <= size; i++)
        {
            primes[i] = true;
        }
        
        // Check for the multiples
        for(int i = 2; i * i <= size; i++)
        {
            if(primes[i] == true)
            {
                for(int j = i * i; j <= size; j += i)
                {
                    // System.out.println(j);
                    primes[j] = false;
                }
            }
        }
        
        // System.out.println("Prime is : ");
        for(int i = 0; i <= size; i++)
        {
            if(primes[i] == true)
                System.out.println(i);
        }
    }
}
