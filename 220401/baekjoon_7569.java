package coding_220401;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Location {
	int z;
	int y;
	int x;

	public Location(int z, int y, int x) {
		this.z = z;
		this.y = y;
		this.x = x;
	}
}

public class baekjoon_7569 {
	static int M, N, H;
	static int[][][] tomato;
	static int[] dx = { -1, 0, 1, 0, 0, 0 };
	static int[] dy = { 0, 1, 0, -1, 0, 0 };
	static int[] dz = { 0, 0, 0, 0, 1, -1 };
	static int gtomato = 0, days = 0;
	static Queue<Location> rtomato = new LinkedList<Location>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		H = Integer.parseInt(st.nextToken());
		
		tomato = new int[H][N][M];
		
		
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < N; j++) {
				st = new StringTokenizer(br.readLine()," ");
				for (int k = 0; k < M; k++) {
					tomato[i][j][k] = Integer.parseInt(st.nextToken());
					if(tomato[i][j][k] == 0) gtomato++;
					else if(tomato[i][j][k] == 1) rtomato.add(new Location(i, j, k));
				}// M for end
			}// N for end
		}//H for end
		
		while(gtomato>0 && !rtomato.isEmpty()) {
			int aa = rtomato.size();
			for (int i = 0; i < aa; i++) {
				Location lc = rtomato.remove();
				int z = lc.z;
				int y = lc.y;
				int x = lc.x;
				for (int j = 0; j < 6; j++) {
					int nz = z + dz[j];
					int ny = y + dy[j];
					int nx = x + dx[j];
					if (nz < 0 || ny < 0 || nx < 0 || nz >=H  || ny >= N || nx >= M)
						continue;
					else if (tomato[nz][ny][nx] != 0)
						continue;
							
					
					gtomato --;
					tomato[nz][ny][nx] = 1;
					rtomato.add(new Location(nz, ny, nx));

				}// for end
				
			}// for end
			days++;
		}// while end
		
	System.out.println(gtomato==0?days:-1);
	}
}
