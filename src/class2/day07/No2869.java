package class2.day07;

import java.io.*;
import java.util.StringTokenizer;

public class No2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int ride = Integer.parseInt(st.nextToken());
        int slip = Integer.parseInt(st.nextToken());
        int total = Integer.parseInt(st.nextToken());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write((int) Math.ceil((double) (total - slip) / (ride - slip)) + "");
        bw.flush();
        bw.close();
    }
}
