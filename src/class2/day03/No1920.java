package class2.day03;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arrLen = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] input = new int[arrLen];
        for(int i = 0; i < arrLen;i++){
            input[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(input);

        int findLen = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0; i < findLen; i++){
            if(Arrays.binarySearch(input, Integer.parseInt(st.nextToken())) >= 0){
                bw.write('1');
            } else{
                bw.write('0');
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();

    }
}
