package class2.day07;

import java.io.*;
import java.util.StringTokenizer;

public class No2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = Integer.parseInt(st.nextToken());
        int standard = Integer.parseInt(st.nextToken());

        int[] cards = new int[count];
        st = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < count; i++){
            cards[i] = Integer.parseInt(st.nextToken());
        }

        int best = blackJack(cards, standard);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(best + "");
        bw.flush();
        bw.close();
    }

    private static int blackJack(int[] cards, int standard) {
        int best = 0;
        for(int i = 0 ; i < cards.length - 2; i++){
            for(int j = i + 1; j < cards.length - 1; j++){
                for(int k = j + 1; k < cards.length; k++){
                    int sum = cards[i] + cards[j] + cards[k];
                    if(sum <= standard && sum > best){
                        best = sum;
                    }
                }
            }
        }
        return best;
    }
}
