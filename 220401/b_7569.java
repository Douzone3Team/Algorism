package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class b_7569 {
	static int M;
	static int N;
	static int H;
	static int day = 0;
	
	static int[][][] arr;
	static boolean [][][]check;
					
					// 오, 위, 왼, 아래, 상, 하 
	static int[] x = {1, 0, -1, 0, 0, 0};
	static int[] y = {0, 1, 0, -1, 0, 0};
	static int[] z = {0, 0, 0, 0, 1, -1};
	
	static Queue<int[]> q = new LinkedList<>();
	

	public static void main(String[] args) throws IOException {
		// 익은 토마토들의 인접한 곳(1) -> 익지 않은 토마토들 영향(0) , 토마토없(-1)
		// 위, 아래, 왼쪽, 오른쪽, 앞, 뒤 -> 대각선 영향x
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		H = Integer.parseInt(st.nextToken());
		
		arr = new int[M][N][H];
		check = new boolean[M][N][H];
		
		// 입력
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < H; k++) {
					st = new StringTokenizer(br.readLine());
					arr[i][j][k] = Integer.parseInt(st.nextToken());
					if(arr[i][j][k] == 1) {q.offer(new int[]{i,j,k});}
				}
			}
		}
		bfs();
		
	}
	
	public static void bfs() {
		int []now = new int[3];
		int []next = new int[3];
		
		while(!q.isEmpty()) {
			for (int i = 0; i < q.size(); i++) {
				now = q.poll();
				
				for (int j = 0; j < 6; j++) {
					next[0] = now[0] + x[i];
					next[1] = now[1] + y[i];
					next[2] = now[2] + z[i];
					
					if(next[0] < 0 || next[1] < 0 || next[2] < 0 || next[0]>=M || next[1]>=N || next[2] >=H) continue;
					if(arr[next[0]][next[1]][next[2]]==0) {
						arr[next[0]][next[1]][next[2]] = 1;
						q.offer(new int[] {next[0], next[1], next[2]});
					}
				}
			}
			if(q.size()!=0) day++;
		}
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < H; k++) {
					if(arr[i][j][k]==0) {
						System.out.println(-1);
						System.exit(0);
					}
				}
			}
		}
		
		System.out.println(day);
	}

}
