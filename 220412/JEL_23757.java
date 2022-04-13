import java.io.*;
import java.util.*;

public class JEL_23757 {
    public static void main(String[] args) throws Exception {
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        PriorityQueue<Integer> present = new PriorityQueue<>(Collections.reverseOrder());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");
        
        for (int i = 0; i < n; i++) {
            int value = Integer.parseInt(st.nextToken());
            present.offer(value);
        }
        
        st = new StringTokenizer(br.readLine(), " ");
        boolean flag = false;
        
        for (int i = 0; i < m; i++) {
            int child = Integer.parseInt(st.nextToken());
            if (present.peek() >= child) {
                present.offer(present.peek() - child);
                present.poll();
            } else {
                flag = true;
            }
        }
        if (flag == true) {
        	sb.append("0");
        } else {
            sb.append("1");
        }
        bw.write(sb.toString());
        bw.flush(); 
    }
}
