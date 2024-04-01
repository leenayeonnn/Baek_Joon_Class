package class1.day4;

import java.io.*;
import java.util.StringTokenizer;

public class No2920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        char result;
        int current = Integer.parseInt(st.nextToken());

        if (current == 1) {
            result = 1;
        } else if (current == 8) {
            result = 2;
        } else {
            result = 3;
        }

        while (st.hasMoreTokens()) {
            int tmp = Integer.parseInt(st.nextToken());
            if (!(result == 1 && (current + 1) == tmp || result == 2 && (current - 1) == tmp)) {
                result = 3;
                break;
            }
            current = tmp;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if (result == 1) {
            bw.write("ascending");
        } else if (result == 2) {
            bw.write("descending");
        } else {
            bw.write("mixed");
        }

        bw.flush();
        bw.close();
    }
}
