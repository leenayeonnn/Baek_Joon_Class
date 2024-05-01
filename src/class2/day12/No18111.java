package class2.day12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No18111 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int min = 257;
        int max = -1;
        int[] arr = new int[257];
        for (int i = 0; i < h; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < w; j++) {
                int blockNum = Integer.parseInt(st.nextToken());
                arr[blockNum]++;

                max = Math.max(blockNum, max);
                min = Math.min(blockNum, min);
            }
        }

        int resultBase = -1;
        int resultSec = Integer.MAX_VALUE;
        for (int base = min; base <= max; base++) {
            int sec = 0;
            int bAfterWork = b;
            int workBlock;
            for (int i = min; i < base; i++) {
                workBlock = arr[i] * (base - i);
                sec += workBlock;
                bAfterWork -= workBlock;
            }

            for (int i = base + 1; i <= max; i++) {
                workBlock = arr[i] * (i - base);
                sec += workBlock * 2;
                bAfterWork += workBlock;
            }

            if (bAfterWork > -1) {
                if (sec < resultSec || (sec == resultSec && base > resultBase)) {
                    resultSec = sec;
                    resultBase = base;
                }
            }
        }

        System.out.println(resultSec + " " + resultBase);
    }
}
