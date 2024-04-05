package class2.day06;

import java.io.*;
import java.util.Arrays;

public class No2751VerMerge {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }

        sort(numbers, 0, numbers.length - 1);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < count; i++) {
            bw.write(numbers[i] + "\n");
        }

        bw.flush();
        bw.close();
    }

    private static void sort(int[] numbers, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            sort(numbers, left, mid);
            sort(numbers, mid + 1, right);
            merge(numbers, left, mid, right);
        }
    }

    private static void merge(int[] numbers, int left, int mid, int right) {
        int leftPoint = left;
        int rightPoint = mid + 1;
        int idx = 0;

        int[] tmp = new int[right - left + 1];

        while(leftPoint <= mid && rightPoint <= right){
            if (numbers[leftPoint] < numbers[rightPoint]) {
                tmp[idx++] = numbers[leftPoint++];
            } else {
                tmp[idx++] = numbers[rightPoint++];
            }
        }

        if(leftPoint <= mid){
            while(idx < tmp.length){
                tmp[idx++] = numbers[leftPoint++];
            }
        } else{
            while(idx < tmp.length){
                tmp[idx++] = numbers[rightPoint++];
            }
        }

        System.arraycopy(tmp, 0, numbers, left, tmp.length);
    }
}
