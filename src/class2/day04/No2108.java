package class2.day04;

import java.io.*;
import java.util.*;

public class No2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputCount = Integer.parseInt(br.readLine());

        int[] numbers = new int[inputCount];

        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        Map<Integer, Integer> countMap = new HashMap<>();
        List<Integer> modes = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < inputCount; i++) {
            int input = Integer.parseInt(br.readLine());
            numbers[i] = input;

            // 평균
            sum += input;

            // 최대 최소
            if (numbers[i] > max) {
                max = input;
            }
            if (numbers[i] < min) {
                min = input;
            }

            // 최빈값
            if (countMap.containsKey(input)) {
                countMap.put(input, countMap.get(input) + 1);
            } else {
                countMap.put(input, 1);
            }

            if (countMap.get(input) > count) {
                modes.clear();
                modes.add(input);
                count = countMap.get(input);
            } else if(countMap.get(input) == count){
                modes.add(input);
            }
        }

        // 중앙값
        Arrays.sort(numbers);

        // 최빈값
        int mode;
        if(modes.size() == 1){
            mode = modes.get(0);
        } else {
            modes.sort((o1, o2) -> o1 - o2);
            mode = modes.get(1);
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write((int) Math.round((double) sum / inputCount) + "\n");
        bw.write(numbers[inputCount / 2] + "\n");
        bw.write(mode + "\n");
        bw.write((max - min) + "\n");
        bw.flush();
        bw.close();
    }
}
