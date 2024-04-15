package class2.day08;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class No4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<String> isRight = new ArrayList<>();
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] len = {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())};

            if (len[0] == 0) {
                break;
            }

            Arrays.sort(len);
            if (Math.sqrt(len[0] * len[0] + len[1] * len[1]) == len[2]) {
                isRight.add("right");
            } else {
                isRight.add("wrong");
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (String str : isRight) {
            bw.write(str + "\n");
        }

        bw.flush();
        bw.close();
    }
}
