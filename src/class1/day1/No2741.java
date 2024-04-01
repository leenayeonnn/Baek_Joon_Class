package class1.day1;

import java.io.*;

public class No2741 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 1; i <= num; i++) {
            bw.write(String.valueOf(i));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
