public class Main {

    public static int numTrees(int n) {
        long[] dp = new long[n+1];
        dp[0]=1;
        dp[1]=1;
        long mod = 1000000007;

        for(int i=2;i<=n;i++) {
            dp[i]=0;
            for(int j=1;j<=i;j++) {
                dp[i] = (dp[i] + (dp[j-1]*dp[i-j])%mod)%mod;
            }
        }

        return (int)dp[n];
    }

    public static void main(String[] args) {
        System.out.println(numTrees(3));
    }
}