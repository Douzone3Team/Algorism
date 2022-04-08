import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class JEL_4673 { 
	public static void main(String[] args) throws IOException { 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		boolean[] arr = new boolean[10001];
		arr[0] = true; //0은 셀프넘버 X
		for (int i = 1; i < arr.length; i++) {
			int result = i;
			String[] str = String.valueOf(i).split("");

			for (String s : str) {
				result = result + Integer.parseInt(s);
			}
			if (result <= 10000) {
				arr[result] = true;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (!arr[i]) { //false면 셀프넘버
				bw.write(String.valueOf(i));
				bw.newLine();
			}
		}
		bw.flush();
	}
} 
