package class1.day2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class No10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        List<Integer> result = new ArrayList<>();

        String input;
        while ((input = br.readLine()) != null && !input.isEmpty()) {
            st = new StringTokenizer(input);
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
