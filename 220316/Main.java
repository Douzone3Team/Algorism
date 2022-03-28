package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String s = br.readLine();
		
		boolean []seat = new boolean[N + 1];
		int count = 0;
		boolean couple = false;	
		

		for(int i = 0; i < N; i++) {
			char c = s.charAt(i);
			
			if(c == 'L') {
				if(!couple) {
					couple = false;
					seat[i + 1] = false;
				}
				else couple = true;
			}
			
			if(!seat[i]) seat[i] = false;
			else if(!seat[i + 1])seat[i + 1] = false;


		}
		
		for (int i = 0; i < N; i++) {
			if(!seat[i]) count++;
			else if(!seat[i]) {count++;}
		}
		
		System.out.println(count);
	}
}
