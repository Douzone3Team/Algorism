import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HSR_1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int roomNum = Integer.parseInt(br.readLine());
        int set = 0;
        int[] numcnt = new int[10];

        while ( roomNum > 0 ) {
            int getPiece = roomNum % 10;
            roomNum /= 10;
            numcnt[getPiece]++;
            if ( roomNum < 10 ) {
                numcnt[roomNum]++;
                break;
            }
        }
        for (int i = 0; i < numcnt.length; i++) {
            if(i == 6 || i == 9){
                int use = (numcnt[6] + numcnt[9])/2 + (numcnt[6] + numcnt[9])%2;
                set = Math.max(use, set);

            }else{
                set = Math.max(numcnt[i], set);
            }

        }
        System.out.println(set);
    }
}
