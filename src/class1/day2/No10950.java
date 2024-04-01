package class1.day2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class No10950 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        StringTokenizer st;
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            st = new StringTokenizer(br.readLine());
            result.add(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i : result) {
            bw.write(String.valueOf(i));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
