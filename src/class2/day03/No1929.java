package class2.day03;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int min = Integer.parseInt(st.nextToken());
        int max = Integer.parseInt(st.nextToken());

        boolean[] isPrime = new boolean[max + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i <= max; i++) {
            if(isPrime[i]){
                int multi = 2;
                while((i * multi) <= max){
                    isPrime[i * multi] = false;
                    multi++;
                }
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = min; i<= max; i++ ){
            if(isPrime[i]){
                bw.write(i + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
