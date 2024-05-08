package class3.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class No1003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());

        int[] fibo = new int[41];
        fibo[0] = 1;
        fibo[1] = 1;
        for (int i = 2; i <= 40; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < test; i++) {
            int input = Integer.parseInt(br.readLine());

            if (input == 0) {
                sb.append("1 0").append("\n");
                continue;
            }

            if (input == 1) {
                sb.append("0 1").append("\n");
                continue;
            }

            sb.append(fibo[input - 2]).append(" ").append(fibo[input - 1]).append("\n");
        }
        System.out.println(sb.toString());
    }
}
