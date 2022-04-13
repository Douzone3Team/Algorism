package coding_220413;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class baekjoon_1764 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		Set<String> nL = new HashSet<String>();
		ArrayList<String> nLS = new ArrayList<String>();
		
		for (int i = 0; i < N; i++) {
			nL.add(br.readLine());
		}
		for (int i = 0; i < M; i++) {
			String nS = br.readLine();
			if(nL.contains(nS)) {
				nL.remove(nS);
				nLS.add(nS);
			}
		}
		
		Collections.sort(nLS);
		System.out.println(nLS.size());
		for (int i = 0; i < nLS.size(); i++) {
			System.out.println(nLS.get(i));
		}
	}
}
