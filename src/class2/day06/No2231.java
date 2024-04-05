package class2.day06;

import java.io.*;

public class No2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int minus = (input.charAt(0) - '0') + (input.length() - 1) * 9;

        int endNum = Integer.parseInt(input);
        int startNum = endNum - minus;

        int result = 0;
        for(int i = startNum; i < endNum; i++) {
            int sum = i;
            int tmp = i;

            while(tmp != 0){
                sum += tmp % 10;
                tmp /= 10;
            }

            if(sum == endNum){
                result = i;
                break;
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        if(result == 0){
            bw.write('0');
        } else{
            bw.write(String.valueOf(result));
        }

        bw.flush();
        bw.close();
    }
}
