package class2.day01;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class No1181 {
    public static void main(String[] args) throws IOException {

        Set<String> set = input();

        String[] words = set.toArray(new String[0]);

        lenSort(words, 0, words.length - 1);
        alphabetSort(words);

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

    private static void lenSort(String[] words, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            lenSort(words, left, mid);
            lenSort(words, mid + 1, right);
            len_merge(words, left, mid, right);
        }

    }

    private static void len_merge(String[] words, int left, int mid, int right) {
        int left_point = left;
        int right_point = mid + 1;
        int idx = 0;

        String[] tmp = new String[right - left + 1];

        while (left_point <= mid && right_point <= right) {
            if (words[left_point].length() < words[right_point].length()) {
                tmp[idx++] = words[left_point++];
            } else {
                tmp[idx++] = words[right_point++];
            }
        }

        if (left_point > mid) {
            while (idx < tmp.length) {
                tmp[idx++] = words[right_point++];
            }
        } else {
            while (idx < tmp.length) {
                tmp[idx++] = words[left_point++];
            }
        }

        System.arraycopy(tmp, 0, words, left, right - left + 1);
    }

    private static void alphabetSort(String[] words) {
        int i = 0;
        while (i < words.length) {
            int j = i + 1;
            while (j < words.length) {
                if (words[j].length() != words[i].length()) {
                    break;
                }
                j++;
            }

            String[] temp = Arrays.copyOfRange(words, i, j);
            Arrays.sort(temp);
            System.arraycopy(temp, 0, words, i, j - i);

            i = j;
        }
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
