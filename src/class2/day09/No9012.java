package class2.day09;

import java.io.*;

public class No9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            String input = br.readLine();

            int stack = 0;
            int point = 0;
            while (point < input.length()) {
                if (input.charAt(point) == ')') {
                    if (stack == 0) {
                        sb.append("NO\n");
                        break;
                    }

                    stack--;
                    point++;
                    continue;
                }

                if (input.charAt(point) != '(') {
                    sb.append("NO\n");
                    break;
                }

                stack++;
                point++;
            }

            if (point == input.length()) {
                if (stack != 0) {
                    sb.append("NO\n");
                } else {
                    sb.append("YES\n");
                }
            }

        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
