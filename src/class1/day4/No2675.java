package class1.day4;

import java.io.*;
import java.util.StringTokenizer;

public class No2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int repeat = Integer.parseInt(st.nextToken());
            String str = st.nextToken();

            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < str.length(); j++) {
                sb.append(String.valueOf(str.charAt(j)).repeat(repeat));
            }

            bw.write(sb.toString());
            bw.newLine();
        }
        
        bw.flush();
        bw.close();
    }
}
