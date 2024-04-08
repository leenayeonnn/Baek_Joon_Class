package class2.day07;

import java.io.*;

public class No2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int kg = Integer.parseInt(br.readLine());

        int best = findBest(kg);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(best + "");
        bw.flush();
        bw.close();
    }

    private static int findBest(int kg) {
        int best = -1;
        if(kg % 5 == 0){
            return kg / 5;
        }

        for (int i = kg / 5; i >= 0; i--) {
            int remain = kg - 5 * i;
            if (remain % 3 == 0) {
                best = i + remain / 3;
                break;
            }
        }
        return best;
    }
}
