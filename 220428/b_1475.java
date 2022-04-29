package backjoon;
import java.util.Scanner;

public class b_1475 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int inputNum = scan.nextInt();
        int a = inputNum;
        int[] platsticNumber = new int[10];
        int cnt = 1;
        int tmp = 0;

        while (a / 10 != 0) {
            a = a / 10;
            cnt++;
        }

        for (int i = 0; i < cnt; i++) {
            tmp = inputNum % 10;
            inputNum = inputNum / 10;
            if (tmp == 6)
                platsticNumber[9]++;
            else
                platsticNumber[tmp]++;
        }

        int max = 0;
        if(platsticNumber[9]%2==0)
            platsticNumber[9] = platsticNumber[9]/2;
        else
            platsticNumber[9] = (platsticNumber[9]/2)+1;
        
        for(int i=0;i<10;i++) {
            max = Math.max(max, platsticNumber[i]);
        }
        System.out.println(max);
    }
}