import java.util.*;

public class IncrementalSieve {
    public static void main(String[] args) {
        int n = 100;
        ArrayList<Integer> prime = new ArrayList<>();
        prime.add(2);
        for(int i = 3; i <= 100; i+=2)
        {
            boolean isPrime = true;
            int sq = (int)Math.sqrt(i);
            for(int p : prime)
            {
                if(p > sq)
                    break;
                if(i % p == 0)
                {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime)
                prime.add(i);
        }

        for(int p : prime)
            System.out.println(p);
    }
}
