package dailyAlgorism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class HSR_1654 {
	static long cnt = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K, N;
		long line[];
		StringTokenizer st = new StringTokenizer(br.readLine());
		K = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		
		line = new long[K];
		for (int i = 0; i < K; i++) {
			line[i] = Long.parseLong(br.readLine());
		}
		
		Arrays.sort(line);
		//최소공배수가 N이 되는 배수 구하기		
		sort(line,0,line[K-1],N);
	}
	static void sort(long[] arr, long start, long end, long num ) {
		long mid = 0;	
		long cnt = 0;	//자른 랜선 개수
		while(start <= end) {
			
			mid = (start + end) / 2;
			System.out.println("mid:"+mid);
			cnt = 0;
			for (int i = 0; i < arr.length; i++) {
				cnt += arr[i] / mid;
			}
			
			if(cnt == num) {	//자른 랜선 개수가 원하는 개수와 같을때 정지
				System.out.print(mid);
				break;
			}
			else if(cnt > num) {	//자른 랜선 개수가 원하는 개수보다 많을때 mid를 줄
				start = mid + 1;
			}
			else if(cnt < num ) {
				end = mid -1;
			}
		}
		
	}
}
