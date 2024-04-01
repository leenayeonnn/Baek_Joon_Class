package class1.day3;

import java.io.*;

public class No27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int idx = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(str.charAt(idx - 1));
        bw.flush();
        bw.close();
    }
}
