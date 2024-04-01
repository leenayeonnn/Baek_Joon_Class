package class1.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No1000 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        try {
            st = new StringTokenizer(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));

    }
}
