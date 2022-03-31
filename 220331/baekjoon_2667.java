package coding_220331;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class baekjoon_2667 {
	static int N;
	static int[][] apart, visited;
	static int[] dx = { -1,0, 1, 0, };
	static int[] dy = { 0,1, 0, -1 };
	static int count;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		ArrayList<Integer> al = new ArrayList<Integer>();
		N = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		apart = new int[N][N];
		visited = new int[N][N];
		
		int cnt=0;
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			for (int j = 0; j <N; j++) {
				apart[i][j] = Character.getNumericValue(str.charAt(j));
			}
		}// apart 값 삽입
		
		//배열값 일괄 0으로 초기화
		for (int i = 0; i < visited.length; i++) {
			Arrays.fill(visited[i], 0);
		}//end for
		
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if(visited[i][j] == 0 && apart[i][j] == 1) {
					cnt++;
					al.add(findApart(i,j));
					count = 0;
				}//end if
			}//end for
		}//end for
		System.out.println(cnt);
		
		Collections.sort(al);//오름차순 정렬
		
		for (int i = 0; i < cnt; i++) {
			System.out.println(al.get(i));
		}
	}
	
	static int findApart(int x, int y) {
		count++;
		visited[x][y] = 1;
		
		for (int i = 0; i < 4; i++) {
			int nx = x+dx[i];
			int ny = y+dy[i];
			
			if(nx>=0 && nx < N && ny>=0 && ny < N) {
				if(visited[nx][ny] == 0 && apart[nx][ny] == 1) {
					findApart(nx, ny);
				}//end if
			}//end if
		}//end for
		return count;
	}//end findApart
}
