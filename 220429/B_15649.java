package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B_15649 {
	static int N,M;
	static int[]arr;
	static boolean[]visit;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new int[M];
		visit = new boolean[N+1];
		dfs(0);
		
	}

	private static void dfs(int num) {
		if(num == M) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]+ " ");
			}
			System.out.println();
			return;
		}
		for (int i = 0; i < N; i++) {
			if(!visit[i]) {
				visit[i] = true;
				arr[num] = i+1;
				dfs(num+1);
				visit[i] = false;
			}
		}

		
	}
}
