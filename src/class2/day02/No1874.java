package class2.day02;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class No1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        int[] input = new int[count];
        for (int i = 0; i < count; i++) {
            input[i] = Integer.parseInt((br.readLine()));
        }

        StringBuilder result = findStackFlow(input);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }

    private static StringBuilder findStackFlow(int[] input) {
        StringBuilder result = new StringBuilder();

        int point = 0;
        int num = 1;
        List<Integer> stack = new ArrayList<>();
        while (point < input.length) {
            if (stack.isEmpty()) {
                stack.add(num++);
                result.append("+\n");
                continue;
            }

            if (stack.get(stack.size() - 1) == input[point]) {
                stack.remove(stack.size() - 1);
                point++;
                result.append("-\n");
                continue;
            }

            if(num > input.length){
                break;
            }
            stack.add(num++);
            result.append("+\n");
        }

        if (point < input.length) {
            result = new StringBuilder("NO");
        }

        return result;
    }
}
