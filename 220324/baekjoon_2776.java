package coding_220324;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class baekjoon_2776 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		while (T-->0) {
			Set<Integer> set = new HashSet<Integer>();
			StringBuilder sb = new StringBuilder();
			int n = Integer.parseInt(br.readLine());
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for (int i = 0; i < n; i++) {
				set.add(Integer.parseInt(st.nextToken()));
			}
				
			int m = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			
			for (int i = 0; i < m; i++) {
				
				if(set.contains(Integer.parseInt(st.nextToken()))){
					sb.append(1).append("\n");
				}
				else sb.append(0).append("\n");
			}
			System.out.print(sb);
		}
	}
}
