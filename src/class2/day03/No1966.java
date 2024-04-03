package class2.day03;

import java.io.*;
import java.util.*;

public class No1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testNum = Integer.parseInt(br.readLine());

        for (int i = 0; i < testNum; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int docNum = Integer.parseInt(st.nextToken());
            int idx = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            List<Doc> docs = new ArrayList<>();
            for (int j = 0; j < docNum; j++) {
                docs.add(new Doc(j, Integer.parseInt(st.nextToken())));
            }

            int count = 0;
            while (!docs.isEmpty()) {
                Doc tmp = docs.get(0);
                int j = 1;
                while (j < docs.size()) {
                    if(docs.get(j).getPriority() > tmp.getPriority()){
                        docs.add(tmp);
                        docs.remove(0);
                        break;
                    }
                    j++;
                }
                if(j == docs.size()){
                    count++;
                    if(tmp.getIdx() == idx){
                        bw.write(count + "\n");
                        break;
                    }
                    docs.remove(0);
                }
            }
        }

        bw.flush();
        bw.close();
    }
}

class Doc {
    private final int idx;
    private final int priority;

    public Doc(int idx, int priority) {
        this.idx = idx;
        this.priority = priority;
    }

    public int getIdx() {
        return idx;
    }

    public int getPriority() {
        return priority;
    }
}