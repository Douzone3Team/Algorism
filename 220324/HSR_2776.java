package dailyAlgorism;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class HSR_2776 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int N, M;

		StringTokenizer st;
		N = Integer.parseInt(br.readLine());
		
		
		while (N-- > 0) {
			M = Integer.parseInt(br.readLine());			
			int[] note1 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();			

			M = Integer.parseInt(br.readLine());
			
			int[] note2 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			
			
			for (int i = 0; i < note2.length; i++) {
				if(search(note1, note2[i], 0, note1.length-1)) {
					sb.append(1 + "\n");
				}else { sb.append(0+"\n");}
			}
		}
		System.out.println(sb);
	}

	static boolean search(int[] arr ,int num, int start, int end) {

		while (start <= end) {
			int mid = (start + end) / 2;
			
			if (arr[mid] > num) {
				end = mid - 1;

			} else if (arr[mid] < num) {
				start = mid + 1;
			}else {
				return true;
			}
		}
		return false;
	}
}
