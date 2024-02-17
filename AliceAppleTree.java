import java.util.Scanner;
public class AliceAppleTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int K = sc.nextInt();
        int N = sc.nextInt();
        int S = sc.nextInt();
        int E = sc.nextInt();
        int W = sc.nextInt();
        int ans = getAliceApple(M, K, N, S, E, W);
        System.out.println("The minimum number of apple "+ans);
    }
    public static int getAliceApple(int m, int k, int n, int s, int e, int w)
    {
        int totalApplePossible = 0;
        int southPossi = 0, eastPossi = 0, westPosi = 0;
        southPossi += s * k;
        westPosi += w*1;
        eastPossi += e*1;
        totalApplePossible = southPossi + westPosi+eastPossi;
        if(southPossi >= m)
            return m;
        else if(totalApplePossible >= m)
            return m;
        return -1;
    }
}
