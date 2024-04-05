package class2.day06;

import java.io.*;
import java.util.StringTokenizer;

public class No2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        int divisor = GCD(num1, num2);
        int multiple = num1 * num2 / divisor;

        bw.write(divisor + "\n");
        bw.write(multiple + "\n");
        bw.flush();
        bw.close();
    }

    private static int GCD(int num1, int num2) {
        if(num1 == 0){
            return num2;
        }

        if(num2 == 0){
            return num1;
        }

        int max, min;
        if (num1 > num2) {
            max = num1;
            min = num2;
        } else {
            max = num2;
            min = num1;
        }

        while(true){
            if(max % min == 0){
                return min;
            }
            int tmp = max;
            max = min;
            min = tmp % min;
        }
    }
}
