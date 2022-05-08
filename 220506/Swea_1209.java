package algorithm_220506;

import java.util.Scanner;

public class Swea_1209 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int Test = 10;
		int[][] numbers;

		for (int i = 0; i < Test; i++) {
			int n = sc.nextInt();
			numbers = new int[100][100]; // 2���� �迭 ����

			// �� ����
			for (int h = 0; h < 100; h++) {
				for (int w = 0; w < 100; w++) {
					numbers[h][w] = sc.nextInt();
				}
			}

			int sum, Wsum = 0, Hsum = 0;

			// �����ִ밪
			for (int w = 0; w < 100; w++) {
				sum = 0;// sum �ʱ�ȭ
				for (int h = 0; h < 100; h++) {
					sum += numbers[h][w];
				}
				Hsum = Math.max(Hsum, sum);
			}

			

			// ���� �ִ밪 ���ϱ�
			for (int h = 0; h < 100; h++) {
				sum = 0;// sum �ʱ�ȭ
				for (int w = 0; w < 100; w++) {
					sum += numbers[h][w];
				}
				Wsum = Math.max(Wsum, sum);
			}

			sum = 0;// sum �ʱ�ȭ

			// �밢�� �ִ밪
			int sum2=0;
			for (int h = 0; h < 100; h++) {
				sum += numbers[h][h];	// 1. ������ �Ʒ�
				sum2 += numbers[h][99 - h];	// 2. ���� �Ʒ�
			}
			
			int maxValue = Math.max(Hsum, Math.max(Wsum, Math.max(sum, sum2)));
			

			System.out.println("#" + n + " " + maxValue);
		}
	}
}
