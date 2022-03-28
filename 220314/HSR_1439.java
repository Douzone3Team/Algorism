package dailyAlgorism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HSR_1439 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		boolean check = true;
		int cnt = 0;
		
		for (int i = 0; i < S.length()-1; i++) {
			if (S.charAt(i) != S.charAt(i+1)) {
				check = (check) ? false : true;
				if(check == false) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
		
	}
}
