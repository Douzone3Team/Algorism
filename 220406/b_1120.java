package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class b_1120 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");

        String A = st.nextToken();
        String B = st.nextToken();

        int min_value = Integer.MAX_VALUE;

        for (int j = 0; j < B.length() - A.length() + 1; j++) {
            int count = 0;
            for (int i = 0; i < A.length(); i++) {
                if (A.charAt(i) != B.charAt(i + j)) {
                    count += 1;
                }
            }
            min_value = Math.min(min_value, count);
        }

        bw.write(String.valueOf(min_value));
        bw.flush();

        bw.close();
        br.close();
    }
}
