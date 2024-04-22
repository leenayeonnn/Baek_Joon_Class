package class2.day10;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        Member[] members = new Member[count];
        for (int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            members[i] = new Member(Integer.parseInt(st.nextToken()), st.nextToken());
        }
        Arrays.sort(members);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(members[i]).append("\n");
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.flush();
        bw.write(String.valueOf(sb));

        bw.close();
        br.close();
    }

    static class Member implements Comparable<Member> {
        private int age;
        private String name;

        public Member(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public int compareTo(Member o) {
            return this.age - o.age;
        }

        @Override
        public String toString() {
            return age + " " + name;
        }
    }
}
