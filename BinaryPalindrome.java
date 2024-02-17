import java.util.*;
public class BinaryPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str  = "";
        int n;
        System.out.print("Enter a decimal number : ");
        n = sc.nextInt();   
        str = getString(n);
        System.out.println(str);
        boolean check = checkPalindrone(str);
        System.out.println(check);
    }
    public static String getString(int n)
    {
        String ans = "";
        // while(n > 0)
        // {
        //     int temp = n%2;
            
        //     ans += temp;
            
        //     n /= 2;
        // }
        // ans = reverse(ans);
        ans = Integer.toBinaryString(n);
        return ans;
    }
    public static boolean checkPalindrone(String str)
    {
        boolean ans = true;
        for(int i = 0; i < str.length()/2; i++)
        {
            if(str.charAt(i) != str.charAt(str.length()/2-1-i))
            {
                return false;
            }
        }
        return ans;
    }
    public static String reverse(String str)
    {
        String temp = "";
        for(int i = str.length()-1; i >= 0; i--)
        {
            temp += str.charAt(i);
        }
        return temp;
    }
}
