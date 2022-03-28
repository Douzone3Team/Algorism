package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b_1654 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		int K = Integer.parseInt(arr[0]); // K
		int N = Integer.parseInt(arr[1]); // N
		int []values = new int[K];
		
		for (int i = 0; i < K; i++) {
			values[i] = Integer.parseInt(br.readLine()); // K의 값들: 802, 743, 457, 539
		}
		
		Arrays.sort(values);
		long start=1;
		long end = values[values.length-1];
		while(start <= end) {
			int cnt = 0;
			long mid = (start + end)/2;
			for (int i = 0; i < values.length; i++) {
				cnt += values[i]/mid;
			}
			if(cnt >= N) {
				start = mid + 1;
			}else {
				end = mid - 1;
			}
		}
		System.out.println(end);
		
		

	}

}
