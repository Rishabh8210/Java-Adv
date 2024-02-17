// Chinease Theorem
import java.util.*;
public class Remainder_Theorem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the size of array : ");
        int []remainder = new int[n];
        int []divisior = new int[n];
        for(int i = 0; i < n; i++)
        {
            System.out.println("Enter value : ");
            remainder[i] = sc.nextInt();
        }
        int M = 1;
        for(int i = 0; i < n; i++)
        {
            System.out.println("Enter value : ");
            divisior[i] = sc.nextInt();
            M = M * divisior[i];
        }
        int commonDividend = getDividend(n, remainder, divisior, M);
        System.out.println("Common Dividend "+commonDividend);
    }
    public static int getDividend(int n, int []remainder, int []divisior, int M){
        int x = 0;
        for(int i = 0; i < n; i++)
        {
            int m = M / divisior[i];int y = 0;
            for(int j = 0; j < divisior[i]; j++)
            {
                if((m*j)% divisior[i] == 1)
                {
                    y = j;
                    break;
                }
            }
            x += remainder[i]*m*y;
        }
        return x%M;
    }
}
