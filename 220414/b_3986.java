package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class b_3986 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int count = 0;
		while(N-->0) {
			Stack <Character>stack = new Stack<>();
			
			
			char []c = br.readLine().toCharArray();
		
			for (int i = 0; i < c.length ; i++) {
				
				if (stack.size() == 0) {
					stack.add(c[i]);
					
				} else {
					if(c[i] != stack.peek()) {
						stack.add(c[i]);
						
					}else {
						stack.pop();
					}

				}
				
			}
			if(stack.isEmpty()) {count++;}
		}
		
		System.out.println(count);
	}

}
