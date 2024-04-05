package class2.day06;

import java.io.*;

public class No2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input = Integer.parseInt(br.readLine());
        if (input == 1) {
            bw.write('1');
        } else {
            input--;
            int count = 1;
            int standard = 6;
            while (!(input == standard || input / standard == 0)) {
                standard += ++count * 6;
            }
            bw.write(String.valueOf(count + 1));
        }

        bw.flush();
        bw.close();
    }
}
