package class2.day01;

import java.io.*;
import java.util.StringTokenizer;

public class No1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());
        String[] board = new String[row];
        for (int i = 0; i < row; i++) {
            board[i] = br.readLine();
        }

        int minChange = Integer.MAX_VALUE;
        for (int n = 0; n < row - 7; n++) {
            for (int m = 0; m < col - 7; m++) {
                int tmp = repaint(n, m, board);
                if (tmp < minChange) {
                    minChange = tmp;
                }
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(String.valueOf(minChange));
        bw.flush();
        bw.close();

    }

    private static int repaint(int n, int m, String[] board) {
        char color = 'B';
        int count = Integer.MAX_VALUE;

        do {
            int tmp = 0;

            for (int i = n; i < n + 8; i += 2) {
                tmp += repaintRow(color, m, board[i]);
            }
            color = changeColor(color);
            for (int i = n + 1; i < n + 8; i += 2) {
                tmp += repaintRow(color, m, board[i]);
            }

            if (tmp < count) {
                count = tmp;
            }

        } while (color == 'W');

        return count;
    }

    private static int repaintRow(char color, int m, String board) {
        int count = 0;
        for (int i = m; i < m + 8; i += 2) {
            if (board.charAt(i) != color) {
                count++;
            }
        }
        color = changeColor(color);
        for (int i = m + 1; i < m + 8; i += 2) {
            if (board.charAt(i) != color) {
                count++;
            }
        }
        return count;
    }

    private static char changeColor(char color) {
        if (color == 'B') {
            return 'W';
        }
        return 'B';
    }
}
