package class1.day4;

import java.io.*;
import java.util.StringTokenizer;

public class No10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int max, min;
        max = min = Integer.parseInt(st.nextToken());

        for (int i = 0; i < count - 1; i++) {
            int input = Integer.parseInt(st.nextToken());

            if (input > max) {
                max = input;
            } else if (input < min) {
                min = input;
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(min) + " " + String.valueOf(max));
        bw.flush();
        bw.close();
    }
}
