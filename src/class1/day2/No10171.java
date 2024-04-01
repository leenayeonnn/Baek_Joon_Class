package class1.day2;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class No10171 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(
                "\\    /\\\n"
                        + " )  ( ')\n"
                        + "(  /  )\n"
                        + " \\(__)|\n"
        );

        bw.flush();
        bw.close();
    }
}
