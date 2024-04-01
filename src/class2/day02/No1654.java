package class2.day02;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int haveNum = Integer.parseInt(st.nextToken());
        int wantNum = Integer.parseInt(st.nextToken());

        int[] lens = new int[haveNum];
        for (int i = 0; i < haveNum; i++) {
            lens[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(lens);

        long maxLen = findMaxLen(lens, wantNum);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(maxLen));
        bw.flush();
        bw.close();
    }

    private static long findMaxLen(int[] lens, int wantNum) {
        long min = 1;
        long max = lens[lens.length - 1];
        long maxLen = 0;

        long count;
        while (min <= max) {
            long mid = (min + max) / 2;

            count = 0;
            for (int len : lens) {
                count += (len / mid);
            }

            if (count >= wantNum) {
                maxLen = mid;
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }

        return maxLen;
    }
}
