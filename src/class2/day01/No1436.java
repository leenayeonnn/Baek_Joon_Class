package class2.day01;

import java.io.*;

public class No1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int i = 665;
        int count = 0;
        while (count != num) {
            i++;
            if (String.valueOf(i).contains("666")) {
                count++;
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(i));
        bw.flush();
        bw.close();
    }
}
