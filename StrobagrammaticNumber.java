import java.util.*;
public class StrobagrammaticNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a number : ");
        n = sc.nextInt();
        int check = checkForStrobagrammaticNumber(n);
        System.out.println(n + " "+ check);
        if(check == n)
        {
            System.out.println("Yes it is a Strobagrammatic Number");
        }else{
            System.out.println("Sorry, it is not a Strobagrammatic Number");
        }
    }
    public static int checkForStrobagrammaticNumber(int n){
        int rev = 0;
        while(n > 0)
        {
            int rem = n % 10;
            if(rem == 1 || rem == 8 || rem == 0 || rem == 9 || rem == 6){
                if(rem == 6)
                    rem = 9;
                else if(rem == 9)
                    rem = 6;
            }
            else
                break;
            rev = rev * 10 + rem;
            n /= 10;
        }
        return rev;
    }
}
