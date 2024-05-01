package class2.day12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No15829 {
    public static final int MOD = 1234567891;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        String str = br.readLine();

        long multi = 1;
        long result = 0;
        for (int i = 0; i < len; i++) {
            result += (str.charAt(i) - 'a' + 1)  * multi;
            multi = (multi * 31) % MOD;
        }

        result %= 1234567891;

        System.out.println(result);
    }
}
