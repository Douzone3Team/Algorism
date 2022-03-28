package coding_220325;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class baekjoon_1654 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int K = Integer.parseInt(st.nextToken());
		ArrayList<Integer> al = new ArrayList<Integer>(K);
		int N = Integer.parseInt(st.nextToken());
		long max = 0;

		for (int i = 0; i < K; i++) {
			al.add(i, Integer.parseInt(br.readLine()));
			if (max < al.get(i))
				max = al.get(i);
		}

		max++;

		long mid = 0, min = 0;
		
		while (min < max) {
			long cnt=0;
			
			mid = (min + max) / 2;
			
			for (int i = 0; i < K; i++) {
				cnt += (al.get(i) / mid);
			}
			
			if (cnt < N) {
				max = mid;
			} else {
				min = mid + 1;
			}
		}
		System.out.println(min - 1);
	}
}
