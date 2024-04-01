package class1.day4;

import java.io.*;
import java.util.Arrays;

public class No10809 {
    public static void main(String[] args) throws IOException {
        int[] result = new int[26];
        Arrays.fill(result, -1);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        for (int i = 0; i < str.length(); i++) {
            if (result[str.charAt(i) - 'a'] == -1) {
                result[str.charAt(i) - 'a'] = i;
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i : result) {
            bw.write(String.valueOf(i) + " ");
        }

        bw.flush();
        bw.close();
    }
}
