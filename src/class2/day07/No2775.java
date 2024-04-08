package class2.day07;

import java.io.*;
import java.util.Arrays;

public class No2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testNum = Integer.parseInt(br.readLine());

        for(int i = 0; i <testNum; i++){
            int floor = Integer.parseInt(br.readLine());
            int room = Integer.parseInt(br.readLine());

            int result = countPeople(floor, room);

            bw.write(result + "\n");
        }
        bw.flush();
        bw.close();
    }

    private static int countPeople(int floor, int room) {
        int result = 0;
        int[] arr = new int[room];

        for(int i = 0; i < room; i++){
            arr[i] = i + 1;
        }

        for(int i = 0; i < floor ; i++){
            int[] tmp = new int[room];
            for(int j = 0; j < room; j++){
                for(int k = 0; k <= j; k++){
                    tmp[j] += arr[k];
                }
            }
            arr = tmp;
        }
        return arr[arr.length - 1];
    }
}
