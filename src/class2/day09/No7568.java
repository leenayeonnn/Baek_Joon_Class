package class2.day09;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        int[] weight = new int[count];
        int[] height = new int[count];

        for (int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            weight[i] = Integer.parseInt(st.nextToken());
            height[i] = Integer.parseInt(st.nextToken());
        }

        int[] rank = new int[count];
        Arrays.fill(rank, 1);
        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if (weight[i] > weight[j] && height[i] > height[j]) {
                    rank[j]++;
                } else if (weight[i] < weight[j] && height[i] < height[j]) {
                    rank[i]++;
                }
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i : rank) {
            bw.write(i + " ");
        }
        bw.flush();
        bw.close();


    }
}
