package algorithm_220502;

import java.util.Arrays;
import java.util.Scanner;

public class Swea_1208_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Test = 10;

		for(int k = 0; k<Test;k++) {
			int dump = sc.nextInt();//dump 값 입력받기
			
			int[] box = new int[100];//상자의 가로길이(인덱스)만큼 생성
			
			for (int i = 0; i < box.length; i++) {
				box[i] = sc.nextInt(); //인덱스별 높이값 삽입
			}
			Arrays.sort(box);
			//dump 실행
			while (dump-- > 0) {
				box[99]--;
				box[0]++;
				Arrays.sort(box);
			} // dump end
			
			System.out.println("#"+ (k+1) + " " +(box[99]-box[0]) );
		} // test end
		
	}// main end
}
