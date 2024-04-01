package class1.day4;

import java.io.*;
import java.util.Arrays;

public class No1157 {
    public static void main(String[] args) throws IOException {
        int[] result = new int[26];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            result[str.charAt(i) - 'a']++;
        }

        int maxIdx = 0;
        boolean duplicate = false;
        for (int i = 1; i < result.length; i++) {
            if (result[i] > result[maxIdx]) {
                maxIdx = i;
                duplicate = false;
            } else if (result[i] == result[maxIdx]) {
                duplicate = true;
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        if (duplicate) {
            bw.write("?");
        } else {
            bw.write('A' + maxIdx);
        }

        bw.flush();
        bw.close();
    }
}
