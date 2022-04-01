import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Home {
	public int x, y;
	
	Home(int x, int y){
		this.x = x;
		this.y = y;
	}
}

class JEL_2667 {
	static int[] dx = { -1, 1, 0, 0 };
   	static int[] dy = { 0, 0, -1, 1 };
	static ArrayList<Integer> res = new ArrayList<Integer>();
	static int N, cnt, mark = 1;
	static int[][] num;
	
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        StringBuilder sb = new StringBuilder();
	        N = Integer.parseInt(br.readLine());
	        num = new int[N][N];
	        String input;
	        for (int i = 0; i < N; i++) {
	            input = br.readLine();
	            for (int j = 0; j < N; j++) {
	                num[i][j] = input.charAt(j) - '0';
	            }
	        }

	        for (int i = 0; i < N; i++) {
	            for (int j = 0; j < N; j++) {
	                if (num[i][j] == 1) {
	                    cnt = 0;    
	                    mark++;         
	                    dfs(i, j); 
	                    res.add(cnt);
	                }
	            }
	        }
	        
	        System.out.println(mark - 1);
	        res.sort(null);
	        for (int x : res) 
	            sb.append(Integer.toString(x) + '\n');
	        System.out.println(sb);
	    }
	 
	    public static void dfs(int x, int y) {
	        cnt++;    
	        num[x][y] = mark;  

	        for (int d = 0; d < 4; d++) {
	            int xx = x + dx[d];
	            int yy = y + dy[d]; 
	            if (xx < 0 || yy < 0 || xx >= N || yy >= N) {
	            	continue; 
	            }
	            if (num[xx][yy] != 1) {
	            	continue; 
	            }
	            dfs(xx, yy);
	        }
	    }
	} 
