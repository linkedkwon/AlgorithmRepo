package baekjoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2193 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        long[][] dp = new long[2][n + 2];
        dp[1][1] = 1; dp[0][2] = 1;

        for(int i = 3; i < n + 1; i++){
            dp[0][i] = dp[0][i - 1] + dp[1][i - 1];
            dp[1][i] = dp[0][i - 1];
        }

        System.out.println(dp[0][n] + dp[1][n]);
        br.close();
    }
}
