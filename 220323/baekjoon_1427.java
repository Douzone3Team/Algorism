package coding_220323;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class baekjoon_1427 {
	public static void main(String[] args) throws IOException {
		ArrayList<Character> al = new ArrayList<Character>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();
		
		for (int i = 0; i < N.length(); i++) {
			al.add(N.charAt(i));
		}
		Collections.sort(al,Collections.reverseOrder());
		
		for (int i = 0; i < al.size(); i++) {
			System.out.print(al.get(i));
		}
	}
}
