import java.io.IOException;
import java.util.Queue; 		  //BFS(너비우선탐색) => 방문한 노드들을 차례로 저장한 후 꺼낼 수 있는 자료구조인 큐를 사용 => FIFO
import java.io.BufferedReader;    // Scanner(입력받은 문자 정규식 검사 후 문자열 반환) < BufferedReader(정규식 검사X) 
import java.util.StringTokenizer; // split < StringTokenizer 
import java.io.InputStreamReader; 
import java.util.LinkedList;

public class JEL_2178 {
	static int[][] map;
	static int n;
	static int m;
	static boolean[][] visited;
	static int[] dx = { -1, 1, 0, 0 }; 	// x방향 배열 : 상하
	static int[] dy = { 0, 0, -1, 1 };  // y방향 배열 : 좌우

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		map = new int[n][m];
		for(int i=0; i<n; i++) {
			String s = br.readLine();
			for(int j=0; j<m; j++) {
				map[i][j] = s.charAt(j) - '0';
			}
		}
		
		visited = new boolean[n][m];
		visited[0][0] = true;
		bfs(0, 0);
		System.out.println(map[n-1][m-1]);
	}

	public static void bfs(int x, int y) {
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {x,y});

        //큐가 끝날 때까지
		while(!q.isEmpty()) {
			int now[] = q.poll();
			int nowX = now[0];
			int nowY = now[1];
			
			for(int i=0; i<4; i++) {
                //다음 방문할 좌표 nextX, nextY
				int nextX = nowX + dx[i];
				int nextY = nowY + dy[i];
				

                //다음 좌표가 범위를 넘어갈때 건너뛰기
                if (nextX < 0 || nextY < 0 || nextX >= n || nextY >= m)
        		    continue;
                
                //이미 방문했던 점이면 건너뛰기
		        if (visited[nextX][nextY] || map[nextX][nextY] == 0)
            		continue;
            
		        //다음에 방문할 좌표를 큐에 넣는다.
                q.add(new int[] {nextX, nextY});
                
                //배열안에 다음 방문할 곳은 현재 방문했던 점보다 1칸 더 가야하므로 +1
		        map[nextX][nextY] = map[nowX][nowY] + 1;
		        
		        //다음 좌표는 방문했음으로 표시
        		visited[nextX][nextY] = true;
			}
		}
	}
}
