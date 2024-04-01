package class1.day3;

import java.io.*;
import java.util.StringTokenizer;

public class No10250 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCount = Integer.parseInt(br.readLine());

        StringTokenizer st;
        int h, w, n;
        int[] floor = new int[testCount];
        int[] number = new int[testCount];

        for (int i = 0; i < testCount; i++) {
            st = new StringTokenizer(br.readLine());

            h = Integer.parseInt(st.nextToken());
            w = Integer.parseInt(st.nextToken());
            n = Integer.parseInt(st.nextToken());

            number[i] = (n + h - 1) / h;
            floor[i] = n % h;

            if (floor[i] == 0) {
                floor[i] = h;
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < testCount; i++) {
            if (number[i] < 10) {
                bw.write(String.valueOf(floor[i]) + '0' + String.valueOf(number[i]));
            } else {
                bw.write(String.valueOf(floor[i]) + String.valueOf(number[i]));
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
