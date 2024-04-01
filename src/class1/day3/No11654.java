package class1.day3;

import java.io.*;
import java.util.StringTokenizer;

public class No11654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ascii = br.readLine().charAt(0);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(ascii));
        bw.flush();
        bw.close();
    }
}
