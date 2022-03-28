import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class JEL_1026 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		ArrayList<Integer> arrA = new ArrayList<>();
		ArrayList<Integer> arrB = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			arrA.add(a);
		}
		
		for(int i = 0; i < n; i++) {
			int b = sc.nextInt();
			arrB.add(b);
		}

		Collections.sort(arrA); //오름차순 정렬
//		Collections.reverse(arrB); // X => 리스트 구성 뒤집기
		Collections.sort(arrB, Comparator.reverseOrder());
		
		for(int i = 0; i < n; i++) {
			sum += arrA.get(i) * arrB.get(i);
		}
		
		System.out.println(sum);
	}
}
