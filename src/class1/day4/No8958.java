package class1.day4;

import java.io.*;

public class No8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());


        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < count; i++) {
            String input = br.readLine();
            bw.write(String.valueOf(check(input)));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }

    private static int check(String input) {
        int result = 0;
        int accumulate = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'O') {
                result += ++accumulate;
            } else {
                accumulate = 0;
            }
        }
        return result;
    }
}
