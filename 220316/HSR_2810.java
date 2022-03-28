//package dailyAlgorism;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class HSR_2810 {
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int cnt = 0;
//		int N = Integer.parseInt(br.readLine());
//		String seat = br.readLine();
//		StringBuilder sb = new StringBuilder();
//		
//		boolean LL = true;
//		for (int i = 0; i < N; i++) {
//			if(seat.charAt(i) == 'S') {
//				cnt++;
//				sb.append("*S");
//			} else {
//				LL = !LL;
//				if(!LL) {
//					sb.append("*L");
//					cnt++;
//					
//				}else sb.append("L");
//			}
//		}
//		cnt++;
//		System.out.println(cnt);	
//		System.out.println(sb.toString());
//	}
//	
//}

package dailyAlgorism;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HSR_2810 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = 0;
		int N = Integer.parseInt(br.readLine());
		String seat = br.readLine();		
		boolean LL = true;
		for (int i = 0; i < N; i++) {
			if(seat.charAt(i) == 'S') {
				cnt++;
				
			} else {
				LL = !LL;
				if(!LL) {					
					cnt++;					
				}
			}
		}
		cnt++;
		int result = N <= cnt ? N : cnt;
		System.out.println(result);	
		
	}
	
}
