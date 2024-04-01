package class2.day01;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class No1259 {
    public static void main(String[] args) throws IOException {
        List<String> list = input();
        print(list);
    }

    private static List<String> input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<String> list = new ArrayList<>();
        while (true) {
            String input = br.readLine();
            if (input.equals("0")) {
                break;
            }
            list.add(input);
        }
        return list;
    }

    private static void print(List<String> list) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (String str : list) {
            if (checkPalindrome(str)) {
                bw.write("yes");
            } else {
                bw.write("no");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }

    private static boolean checkPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
