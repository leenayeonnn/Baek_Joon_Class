package class1.day2;

import java.io.*;

public class No9498 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int score = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        switch (score / 10){
            case 10:
            case 9:
                bw.write("A");
                break;
            case 8:
                bw.write("B");
                break;
            case 7:
                bw.write("C");
                break;
            case 6:
                bw.write("D");
                break;
            default:
                bw.write("F");
        }

        bw.flush();
        bw.close();
    }
}
