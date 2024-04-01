package class2.day02;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class No1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());


        List<Integer> scores = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < count; i++) {
            int tmp = Integer.parseInt(st.nextToken());
            if (tmp > max) {
                max = tmp;
            }
            scores.add(tmp);
        }

        double sum = 0;
        for(int score: scores){
            sum += 100.0 * score / max;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(sum / count));
        bw.flush();
        bw.close();
    }
}
