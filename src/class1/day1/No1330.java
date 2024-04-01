package class1.day1;

import java.io.*;
import java.util.StringTokenizer;

public class No1330 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if (a > b) {
            bw.write(">");
        } else if (a < b) {
            bw.write("<");
        } else {
            bw.write("==");
        }

        bw.flush();
        bw.close();

    }
}
