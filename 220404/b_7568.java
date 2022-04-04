package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class b_7568 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		
		int [][]arr = new int [N][2];
		ArrayList<Integer> ranklist = new ArrayList<Integer>();
		
		//입력부
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0; i <N; i++) {
			int rank = 1;
			for (int j = 0; j < N; j++) {
				if(arr[i][0]<arr[j][0] && arr[i][1] < arr[j][1]) {
					rank++;
				}
			}
			ranklist.add(rank);
		}
		
		
		for (int i = 0; i < N; i++) {
			System.out.print(ranklist.get(i)+" ");
		}
	}

}
