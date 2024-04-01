package class1.day4;

import java.io.*;
import java.util.StringTokenizer;

public class No1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(st.countTokens()));
        bw.flush();
        bw.close();
    }
}
