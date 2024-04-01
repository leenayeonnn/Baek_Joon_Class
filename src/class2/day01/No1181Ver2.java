package class2.day01;

import java.io.*;
import java.util.*;

public class No1181Ver2 {
    public static void main(String[] args) throws IOException {

        Set<String> set = input();

        String[] words = set.toArray(new String[0]);

        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                } else {
                    return o1.length() - o2.length();
                }
            }
        });

        print(words);
    }

    private static Set<String> input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        Set<String> set = new HashSet<>();
        for (int i = 0; i < count; i++) {
            set.add(br.readLine());
        }
        return set;
    }


    private static void print(String[] words) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (String word : words) {
            bw.write(word);
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
