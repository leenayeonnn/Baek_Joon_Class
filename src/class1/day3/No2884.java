package class1.day3;

import java.io.*;
import java.util.StringTokenizer;

public class No2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());

        if (minute < 45) {
            minute = 15 + minute;

            if (--hour < 0) {
                hour = 23;
            }
        } else {
            minute -= 45;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(hour) + " " + String.valueOf(minute));
        bw.flush();
        bw.close();
    }
}
