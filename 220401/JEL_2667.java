import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Tomato {
	public int x, y;
	
	Tomato(int x, int y){
		this.x = x;
		this.y = y;
	}
}

class JEL_2667 {
	static int M;
	static int N;
	static int[] dx = { -1, 1, 0, 0 };
    static int[] dy = { 0, 0, -1, 1 };
	static int[][] board;
	static Queue<Tomato> q;
	
	public static int BFS() {
		while (!q.isEmpty()) {
			Tomato tomato = q.remove();
			
			int x = tomato.x; 
			int y = tomato.y;
			
			for (int i = 0; i < 4; i++) {
				int nx = x+dx[i];
				int ny = y+dy[i];
				
				if(nx>=0 && ny>=0 && nx<N && ny<M) {
					if(board[nx][ny] == 0) {
						q.add(new Tomato(nx, ny));
						
						board[nx][ny] = board[x][y]+1;
					}
				}
			}
		}
		int result = Integer.MIN_VALUE;
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if(board[i][j] == 0) {
					return -1;
				}
				result = Math.max(result, board[i][j]);
			}
		}
		
		if(result==1) {
			return 0;
		} else {
			return result-1;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		M = sc.nextInt();
		N = sc.nextInt();
		board = new int[N][M];
		q = new LinkedList<Tomato>();
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				board[i][j] = sc.nextInt();
				if(board[i][j] == 1) {
					q.add(new Tomato(i, j));
				}
			}
		}
		System.out.println(BFS());
	}  
}
