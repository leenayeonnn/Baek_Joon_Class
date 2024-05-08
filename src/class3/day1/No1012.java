package class3.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No1012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < test; i++) {
            st = new StringTokenizer(br.readLine());

            int row = Integer.parseInt(st.nextToken());
            int col = Integer.parseInt(st.nextToken());
            int cabbage = Integer.parseInt(st.nextToken());

            boolean[][] field = new boolean[row][col];

            for (int j = 0; j < cabbage; j++) {
                st = new StringTokenizer(br.readLine());
                field[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = true;
            }

            int count = 0;
            for (int y = 0; y < row; y++) {
                for (int x = 0; x < col; x++) {
                    if (field[y][x]) {
                        searchGroup(field, y, x);
                        count++;
                    }
                }
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb.toString());
    }

    private static void searchGroup(boolean[][] field, int y, int x) {
        field[y][x] = false;

        if (y > 0 && field[y - 1][x]) {
            searchGroup(field, y - 1, x);
        }
        if (y < field.length - 1 && field[y + 1][x]) {
            searchGroup(field, y + 1, x);
        }
        if (x > 0 && field[y][x - 1]) {
            searchGroup(field, y, x - 1);
        }
        if (x < field[y].length - 1 && field[y][x + 1]) {
            searchGroup(field, y, x + 1);
        }
    }
}
