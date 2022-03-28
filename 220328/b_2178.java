package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class b_2178 {
	static int N;
	static int M;
	static int [][]arr;
	static int [][]cnt;
	
					//동 서 남 북 
	static int x[] = {0,0,-1,1}; 
	static int y[] = {1,-1,0,0}; 

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[]values = br.readLine().split(" ");
		
		N = Integer.parseInt(values[0]);
		M = Integer.parseInt(values[1]);
		
		arr = new int[N+1][M+1]; // {1,1}에서 출발 {4,6}에서 도착
		cnt = new int[N+1][M+1]; // 지나온곳 카운트
		
		for (int i = 1; i < N+1; i++) {
			String str = br.readLine(); // 한줄씩 가져와서
			for (int j = 1; j < M+1; j++) {
				arr[i][j] = Integer.parseInt(str.split("")[j-1]); // 하나씩 나눠서 저장 
			}
		}
		bfs();
		System.out.println(cnt[N][M]);
		
	}
	public static void bfs() {
		Queue<int[]> q = new LinkedList<>();
		q.offer(new int[] {1,1});
		cnt[1][1] = 1;
		
		int []now = new int[2];
		int []next = new int[2];
		while(!q.isEmpty()) {
			now = q.poll();
			
			for (int i = 0; i < 4; i++) {
				next[0] = now[0] + y[i];
				next[1] = now[1] + x[i];
				
				if(next[0]>0 && next[1]>0 && next[0]<=N && next[1]<=M && arr[next[0]][next[1]]==1 && cnt[next[0]][next[1]]==0) {
					q.offer(new int[] {next[0], next[1]});
					cnt[next[0]][next[1]] = cnt[now[0]][now[1]]+1;
				}
				
			}
			
		}
		
		
		
		
	}

}
