package algorism;

import java.util.*;
 
class UCR_0510{
    public static int map[][] = new int[100][100];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = 0;
        int answer = -1;
        
        for (int t = 0; t < 10; t++) {
            T = sc.nextInt();
            int[] PathLengthArr = new int[100];
            
            for (int i = 0; i < 100; i++)
                for (int j = 0; j < 100; j++)
                    map[i][j] = sc.nextInt();
 
            for (int i = 0; i < 100; i++) {
                // 출발점을 찾으면 알고리즘 수행 후 목적지 도착하면 브레이크
                if (map[0][i] == 1) { // 출발점인 경우
                    PathLengthArr[i] = FindTarget(0, i);
                }
            }
             int min=999999;
                int maxIdx = -1;
            for(int i = 0 ; i<100 ; i++){
                int pathlength = PathLengthArr[i];
                if(pathlength == 0) continue;
                if ( pathlength <= min){
                    min = pathlength;
                    maxIdx = i;
                }
            }
            answer = maxIdx;
            System.out.printf("#%d %d\n", T, answer);
        }
      
    }
 
    public static int FindTarget(int i, int j) {
        boolean[][] visited = new boolean[100][100];
        int PathLength = 0;
        
        while (i<100) {
            visited[i][j] = true;
            PathLength++;
            //System.out.println(i + " : " + j);
            if (map[i][j] == 2) {
                break;
            }
            if (0 <= j - 1 && map[i][j - 1] == 1 && visited[i][j - 1] == false) { // 왼쪽이 뚫린 경우
                j--;
            } 
            else if (j + 1 < 100 && map[i][j + 1] == 1 && visited[i][j + 1] == false) { // 오른쪽이 뚫린 경우
                j++;
            } 
            else { // 아래가 뚫린 경우
                i++;
            }
        }
        return PathLength;
    }
}
