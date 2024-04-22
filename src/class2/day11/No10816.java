package class2.day11;

import java.io.*;
import java.util.StringTokenizer;

public class No10816 {
    public static void main(String[] args) throws IOException {
        int[] haveCards = new int[20000001];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();

        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            haveCards[(Integer.parseInt(st.nextToken())) + 10000000]++;
        }

        br.readLine();

        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (st.hasMoreTokens()) {
            sb.append(haveCards[(Integer.parseInt(st.nextToken())) + 10000000] + " ");
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
