package class2.day10;

import java.io.*;
import java.util.Stack;

public class No10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < count; i++) {
            int input = Integer.parseInt(br.readLine());
            if (input != 0) {
                stack.push(input);
            } else if (!stack.empty()) {
                stack.pop();
            }
        }

        int sum = 0;
        while (!stack.empty()) {
            sum += stack.pop();
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sum + "");
        bw.flush();

        bw.close();
        br.close();
    }
}
