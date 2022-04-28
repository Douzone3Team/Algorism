
import java.util.*;
import java.io.*;

class JEL_14889 {
	static int min = Integer.MAX_VALUE;
	static BufferedReader br;
	static BufferedWriter bw;
	
	static void cal(int[][] s, boolean[] bool) {
		int START = 0;
		int LINK = 0;
		
		for(int i = 0; i < s.length-1; i++) {
			for(int j = i+1; j < s[i].length; j++) {
				if(bool[i] == true && bool[j] == true) {
					START += s[i][j];
					START += s[j][i];
				} else if(bool[i] == false && bool[j] == false) {
					LINK += s[i][j];
					LINK += s[j][i];
				}
			}
		}
		min = Math.min(Math.abs(START - LINK), min);
	}
	
	static void DFS(int[][] s, boolean[] bool, int idx, int count) {
		if(count == s.length/2) {
			cal(s, bool);
			return;
		}
		
		for(int i = idx; i < s.length; i++) {
			if(!bool[i]) {
				bool[i] = true;
				DFS(s, bool, i+1, count+1);
				bool[i] = false;
			}
		}
	}
		
	public static void main(String[] args) throws IOException  {
		br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		int s[][] = new int[n][n];
		boolean bool[] = new boolean[n];
		
		for(int i = 0; i < s.length; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < s[i].length; j++) {
				s[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		DFS(s, bool, 0, 0);
		bw.write(String.valueOf(min));
		bw.flush();
		bw.close();
		br.close();
	}
}
