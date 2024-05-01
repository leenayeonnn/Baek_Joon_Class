package class2.day12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class No18110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int noCheck = (int) Math.round(count * 0.15);

        int[] levels = new int[count];
        for (int i = 0; i < count; i++) {
            levels[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(levels);

        int result = 0;
        for (int i = noCheck; i < count - noCheck; i++) {
              result += levels[i];
        }

        System.out.println((int)Math.round(result / (count - noCheck * 2.0)));
    }
}
