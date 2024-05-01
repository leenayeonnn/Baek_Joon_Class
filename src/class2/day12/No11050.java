package class2.day12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        System.out.println(calBinomial(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
    }

    public static int calBinomial(int n, int k) {
        return calDividend(n, k) / calDivisor(n, k);
    }

    private static int calDividend(int n, int k) {
        int result = 1;
        for (int i = n; i > n - k; i--) {
            result *= i;
        }
        return result;
    }

    private static int calDivisor(int n, int k) {
        int result = 1;

        for (int i = 2; i <= k; i++) {
            result *= i;
        }

        return result;
    }
}
