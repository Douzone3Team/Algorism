package coding_220314;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_1439 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String ss = br.readLine();
		int cnt0 =0;
		int cnt1 =0;
		//첫번째 수 카운트
		if(ss.charAt(0) == '0')	cnt0++;
		else if(ss.charAt(0)=='1')	cnt1++; 
		
		//0->1 or 1->0 바뀔때마다 카운트
		for (int i = 1; i < ss.length(); i++) {
			if(ss.charAt(i-1) != ss.charAt(i)) {
				if(ss.charAt(i)=='0')
					cnt0++;
				else if(ss.charAt(i) == '1')
					cnt1++;
			}
		}
		System.out.println(Math.min(cnt0, cnt1));
	}
}
