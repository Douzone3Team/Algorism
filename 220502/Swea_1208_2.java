package algorithm_220502;

import java.util.Arrays;
import java.util.Scanner;

public class Swea_1208_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Test = 10;

		for(int k = 0; k<Test;k++) {
			int dump = sc.nextInt();//dump �� �Է¹ޱ�
			
			int[] box = new int[100];//������ ���α���(�ε���)��ŭ ����
			
			for (int i = 0; i < box.length; i++) {
				box[i] = sc.nextInt(); //�ε����� ���̰� ����
			}
			Arrays.sort(box);
			//dump ����
			while (dump-- > 0) {
				box[99]--;
				box[0]++;
				Arrays.sort(box);
			} // dump end
			
			System.out.println("#"+ (k+1) + " " +(box[99]-box[0]) );
		} // test end
		
	}// main end
}
