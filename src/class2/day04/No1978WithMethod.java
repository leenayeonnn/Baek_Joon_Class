package class2.day04;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class No1978WithMethod {
    public static void main(String[] args) throws IOException {
        printPrimeCount(checkPrimeCount(input()));
    }

    private static class InputDTO {

        private List<Integer> numbers;
        private int max;

        public InputDTO(List<Integer> numbers, int max) {
            this.numbers = numbers;
            this.max = max;
        }

        public List<Integer> getNumbers() {
            return numbers;
        }

        public int getMax() {
            return max;
        }

    }

    private static InputDTO input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        List<Integer> numbers = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < count; i++) {
            int tmp = Integer.parseInt(st.nextToken());
            numbers.add(tmp);
            if (tmp > max) {
                max = tmp;
            }
        }
        return new InputDTO(numbers, max);
    }

    private static List<Integer> checkPrimeCount(InputDTO inputDTO) {
        List<Integer> numbers = inputDTO.getNumbers();
        int max = inputDTO.getMax();

        boolean[] noPrime = new boolean[max + 1];
        noPrime[0] = true;
        noPrime[1] = true;

        for (int i = 2; i <= max; i++) {
            if (!noPrime[i]) {
                int multi = 2;
                while ((i * multi) <= max) {
                    noPrime[i * multi] = true;
                    multi++;
                }
            }

            for (int j = 0; j < numbers.size(); j++) {
                if (noPrime[numbers.get(j)]) {
                    numbers.remove(j);
                }
            }

            if (numbers.isEmpty()) {
                break;
            }
        }

        return numbers;
    }

    private static void printPrimeCount(List<Integer> primeNumbers) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        if (primeNumbers.isEmpty()) {
            bw.write('0');
        } else {
            bw.write(String.valueOf(primeNumbers.size()));
        }
        bw.flush();
        bw.close();
    }

}
