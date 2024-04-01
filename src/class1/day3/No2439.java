package class1.day3;

import java.io.*;
import java.nio.Buffer;

public class No2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < num - i; j++) {
                bw.write(" ");
            }
            for (int j = 0; j < i; j++) {
                bw.write("*");
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
