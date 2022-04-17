package coding_220415;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class baekjoon_12605 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		Stack<String> sk = new Stack<String>();
		int num = Integer.parseInt(br.readLine());
		StringBuilder sb;
		int x = 1;
		while(num>0) {
			String word = br.readLine();
			st = new StringTokenizer(word," ");
			sb = new StringBuilder();
			while(st.hasMoreElements()) {
				sk.push(st.nextToken());
			}
			int size = sk.size();
			for (int i = 0; i < size; i++) {
				sb.append(sk.pop()).append(" ");
			}
			System.out.println( "Case #"+ x + ": " + sb);
			num--;
			x++;
		}
	}
}
