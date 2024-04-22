package class2.day11;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class No10828 {
    public static void main(String[] args) throws IOException {
        List<Integer> stack = new ArrayList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            st = new StringTokenizer(br.readLine());

            switch (st.nextToken()) {
                case "push":
                    stack.add(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    if (stack.isEmpty()) {
                        sb.append("-1\n");
                    } else {
                        int val = stack.remove(stack.size() - 1);
                        sb.append(val).append("\n");
                    }
                    break;
                case "size":
                    sb.append(stack.size()).append("\n");
                    break;
                case "empty":
                    if (stack.isEmpty()) {
                        sb.append("1\n");
                    } else {
                        sb.append("0\n");
                    }
                    break;
                case "top":
                    if (stack.isEmpty()) {
                        sb.append("-1\n");
                    } else {
                        sb.append(stack.get(stack.size() - 1)).append("\n");
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
