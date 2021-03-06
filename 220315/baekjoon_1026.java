package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class baekjoon_1026 {

public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    StringTokenizer arow = new StringTokenizer(br.readLine());
    StringTokenizer brow = new StringTokenizer(br.readLine());

    int[] a = new int[n];
    Integer[] b = new Integer[n];
    int s =0;

    for(int j=0; j<n; j++) {
        a[j] = Integer.parseInt(arow.nextToken());                
        b[j] = Integer.parseInt(brow.nextToken());
    }

    Arrays.sort(a);     //오름차순 정렬
    Arrays.sort(b, Comparator.reverseOrder());    //내림차순 정렬 

    for(int j=0; j<n; j++) {
        s += a[j]*b[j];
    }

    System.out.print(s);

	}
}