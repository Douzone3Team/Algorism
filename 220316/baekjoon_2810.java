package coding_220316;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_2810 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String ss = br.readLine(); 
		
		double cntS = 0;
		//양끝은 무조건 있음
		//시작과 동시에 +1
		cntS++;
		
		for (int i = 0; i < ss.length(); i++) {
			if(ss.charAt(i) == 'S') cntS++;
			else if(ss.charAt(i)=='L') cntS =  cntS+0.5;
		}

		System.out.println(Math.min((int)cntS,N));
	}
}
