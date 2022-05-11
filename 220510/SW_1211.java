import java.util.*;
 
class Point{
    int row,col;
}
public class SW_1211 {
    static Scanner sc = new Scanner(System.in);
    static int[][] map = new int[100][100];
    static int flag = 0;  
    static Vector<Integer> v;
            
    static void read() {
        sc.nextInt();
        v = new Vector<Integer>();
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                map[i][j] = sc.nextInt();
                if (i==0 && map[i][j] == 1) { v.add(j); }
            }
        }
    }
 
    static int getNum() {
        int idx = -1, dis_min = Integer.MAX_VALUE;
        for(int i=0; i < v.size(); i++) {
            int r = 0, c = v.get(i), cnt=1;
            flag = 0;
            while (true) {
                if (r == 99) {
                    if(cnt <= dis_min) {
                        idx = v.get(i);
                        dis_min = cnt;
                    } 
                    break;
                }
                if (flag == 0) { 
                    if (isValid(r, c - 1)) { 
                        c--;
                        flag = 1;
                    } else if (isValid(r, c + 1)) {
                        c++;
                        flag = 2;
                    } else r++;
                } else { 
                    if (flag == 1) { 
                        if (isValid(r + 1, c)) {
                            r++;
                            flag = 0;
                        } else
                            c--;
 
                    } else {
                        if (isValid(r + 1, c)) {
                            r++;
                            flag = 0;
                        } else
                            c++;
                    }
                }
                cnt++;
            }
        }
        return idx;
    }
 
    static boolean isValid(int r, int c) {
        if ((r >= 0 && r < 100) && (c >= 0 && c < 100) && (map[r][c] != 0)) {
        	return true;
        }
        return false;
    }
 
    static void answer() {
        for (int i = 1; i <= 10; i++) {
            read();
            System.out.println("#" + i + " " + getNum());
        }
    }
 
    public static void main(String[] args) { 
    	answer();
    }
 
} 
