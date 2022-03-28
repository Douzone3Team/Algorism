import java.util.Scanner;

public class JEL_2606 { 
	static int computer, network, coup;
	static int count = 0;
	static boolean visit[]; 
	static int map[][];
	
	public static int dfs(int i) {
		visit[i] = true;
		
		for(int j=1; j<=computer; j++) {
			if(map[i][j] == 1 && visit[j] == false) {
				count ++;
				dfs(j);
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		computer = scan.nextInt(); 
		network = scan.nextInt();
		coup = 1;	 
		map = new int[computer+1][computer+1]; 
		visit = new boolean[computer+1]; 
		
		for(int i=0; i<network; i++) {
			int n = scan.nextInt();
			int m = scan.nextInt();
			map[n][m] = map[n][m]= 1;
		}
		
		System.out.println(dfs(1));
		scan.close();
	}
}
