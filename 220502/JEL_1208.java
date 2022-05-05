import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays; 
import java.util.StringTokenizer;

public class SW_1208 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 1; i < 11; i++) {
			int dump = Integer.parseInt(br.readLine());
			int[] arr = new int[100];
			
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < 100; j++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			int count = 0;
			while (true) {
				if(dump==count) {
					break;
				}
				Arrays.sort(arr);
				arr[99]--;
				arr[0]++;
				count++;
			}
			Arrays.sort(arr);
			System.out.println("#"+ i + " " + (arr[99]-arr[0]));
		}
	}
}
