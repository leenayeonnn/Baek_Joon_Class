package class2.day11;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class No10845 {
    public static void main(String[] args) throws IOException {
        Deque<Integer> queue = new ArrayDeque<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            st = new StringTokenizer(br.readLine());

            switch (st.nextToken()) {
                case "push":
                    queue.add(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    if (queue.isEmpty()) {
                        sb.append("-1\n");
                    } else {
                        sb.append(queue.remove()).append("\n");
                    }
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                case "empty":
                    if (queue.isEmpty()) {
                        sb.append("1\n");
                    } else {
                        sb.append("0\n");
                    }
                    break;
                case "front":
                    if (queue.isEmpty()) {
                        sb.append("-1\n");
                    } else {
                        sb.append(queue.peek()).append("\n");
                    }
                    break;
                case "back":
                    if (queue.isEmpty()) {
                        sb.append("-1\n");
                    } else {
                        sb.append(queue.getLast()).append("\n");
                    }
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString());
        bw.flush();

        bw.close();
        br.close();
    }
}
