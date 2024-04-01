package class1.day1;

import java.io.*;
import java.util.StringTokenizer;

public class No1001 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(Integer.parseInt(st.nextToken()) - Integer.parseInt(st.nextToken())));
        bw.flush();
        bw.close();

    }
}
