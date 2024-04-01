package class1.day2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class No10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        List<Integer> result = new ArrayList<>();

        int firstNum;
        int secondNum;

        while (true) {
            st = new StringTokenizer(br.readLine());

            firstNum = Integer.parseInt(st.nextToken());
            secondNum = Integer.parseInt(st.nextToken());

            if (firstNum == 0 && secondNum == 0) {
                break;
            }
            result.add(firstNum + secondNum);
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
