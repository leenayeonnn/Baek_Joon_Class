package class1.day2;

import java.io.*;
import java.util.StringTokenizer;

public class No10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int temp;
        while (st.hasMoreTokens()) {
            if ((temp = Integer.parseInt(st.nextToken())) < num) {
                bw.write(String.valueOf(temp) + " ");
            }
        }
        bw.flush();
        bw.close();
    }
}
