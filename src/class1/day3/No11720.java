package class1.day3;

import java.io.*;
import java.util.StringTokenizer;

public class No11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        String numbers = br.readLine();

        int sum = 0;
        for (int i = 0; i < num; i++) {
            sum += numbers.charAt(i) - '0';
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
}
