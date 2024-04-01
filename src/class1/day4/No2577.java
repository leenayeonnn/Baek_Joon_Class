package class1.day4;

import java.io.*;
import java.util.StringTokenizer;

public class No2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        String str = String.valueOf(a * b * c);

        int[] arr = new int[10];
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i)  - '0']++;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < 10; i++) {
            bw.write(String.valueOf(arr[i]));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
