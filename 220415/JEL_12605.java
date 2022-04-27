import java.io.*;

public class JEL_12605 {  
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			String arr[] = str.split(" ");

			System.out.print("Case #" + (i + 1) + ": ");
			for (int j = arr.length - 1; j >= 0; j--) {
				System.out.print(arr[j] + " ");
			}
		}
	}
}
