package class2.day08;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class No4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        String tmp;
        while ((tmp = br.readLine()) != null && !tmp.isEmpty()) {
            sb.append(tmp);
        }

        StringTokenizer st = new StringTokenizer(sb.toString(), ".");
        sb.setLength(0);
        while (st.hasMoreTokens()) {
            List<Character> brackets = new ArrayList<>();
            tmp = st.nextToken();

            int idx = 0;
            while (idx < tmp.length()) {
                char ch = tmp.charAt(idx);
                if (ch == '(' || ch == '[') {
                    brackets.add(ch);
                } else if (ch == ')' && !checkBalance(brackets, '(')) {
                    break;
                } else if (ch == ']' && !checkBalance(brackets, '[')) {
                    break;
                }
                idx++;
            }

            if (brackets.isEmpty() && idx == tmp.length()) {
                sb.append("yes\n");
            } else {
                sb.append("no\n");
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static boolean checkBalance(List<Character> brackets, char ch) {
        if (brackets.isEmpty() || brackets.get(brackets.size() - 1) != ch) {
            return false;
        }
        brackets.remove(brackets.size() - 1);
        return true;
    }
}