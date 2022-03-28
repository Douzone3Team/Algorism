import java.util.Scanner;
public class Main {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		String su = sc.next();
		
		int []num_arr = new int[su.length()];
		
		for (int i = 0; i < su.length(); i++) {
			num_arr[i] = Integer.parseInt(String.valueOf(su.charAt(i)));
		}
		
		
		int one = 0;
		int zero = 0;
		int pri = -1;
		for (int i = 0; i < num_arr.length; i++) {
			int num = num_arr[i];
			if(num != pri) {
				if(num==0) zero++;
				else one++;
			}
			pri = num;

		}
		System.out.println(Math.min(one, zero));
		
	}

}