package class1.day3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class No2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = 0;
        int maxIdx = 0;
        int tmp;
        for (int i = 0; i < 9; i++) {
            if ((tmp = Integer.parseInt(br.readLine())) > max) {
                max = tmp;
                maxIdx = i;
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(max + "\n" + (maxIdx + 1));
        bw.flush();
        bw.close();
    }
}
