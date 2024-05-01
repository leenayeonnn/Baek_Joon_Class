package class2.day12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class No11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int total = Integer.parseInt(st.nextToken());
        int removeNum = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= total; i++) {
            queue.add(i);
        }

        StringBuilder sb = new StringBuilder("<");
        int count = 0;
        while (queue.size() > 1) {
            count++;

            if (count != removeNum) {
                queue.add(queue.remove());
                continue;
            }

            sb.append(queue.remove()).append(", ");
            count = 0;
        }
        sb.append(queue.remove()).append(">");

        System.out.println(sb.toString());
    }
}
