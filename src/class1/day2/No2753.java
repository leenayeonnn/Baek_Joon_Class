package class1.day2;

import java.io.*;

public class No2753 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if (year % 4 == 0 && (year % 400 == 0 || year % 100 != 0)) {
            bw.write("1");
        } else {
            bw.write("0");
        }

        bw.flush();
        bw.close();
    }
}
