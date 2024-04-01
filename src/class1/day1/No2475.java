package class1.day1;

import java.io.*;
import java.util.StringTokenizer;

public class No2475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int sum = 0;

        while (st.hasMoreTokens()) {
            sum += (int) Math.pow(Integer.parseInt(st.nextToken()), 2);
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(sum % 10));
        bw.flush();
        bw.close();
    }
}
