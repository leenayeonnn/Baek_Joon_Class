package class2.day04;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class No1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        List<Integer> numbers = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < count; i++) {
            int tmp = Integer.parseInt(st.nextToken());
            numbers.add(tmp);
            if (tmp > max) {
                max = tmp;
            }
        }

        boolean[] noPrime = new boolean[max + 1];
        noPrime[0] = true;
        noPrime[1] = true;

        for (int i = 2; i <= max; i++) {
            if (!noPrime[i]) {
                int multi = 2;
                while ((i * multi) <= max) {
                    noPrime[i * multi] = true;
                    multi++;
                }
            }

            for (int j = 0; j < numbers.size(); j++) {
                if (noPrime[numbers.get(j)]) {
                    numbers.remove(j);
                }
            }

            if (numbers.isEmpty()) {
                break;
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if(numbers.isEmpty()){
            bw.write('0');
        } else{
            bw.write(String.valueOf(numbers.size()));
        }
        bw.flush();
        bw.close();
    }
}
