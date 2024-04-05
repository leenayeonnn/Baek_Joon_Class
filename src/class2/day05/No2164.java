package class2.day05;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class No2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int number = Integer.parseInt(br.readLine());

        Queue<Integer> cards = new LinkedList<>();

        for(int i = 1; i <= number; i++){
            cards.add(i);
        }

        boolean drop = true;
        while(cards.size() > 1){
            if(drop){
                cards.poll();
            } else{
                cards.add(cards.poll());
            }

            drop = !drop;
        }

        bw.write(String.valueOf(cards.poll()));
        bw.flush();
        bw.close();
    }
}
