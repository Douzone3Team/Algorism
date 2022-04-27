package backjoon;

import java.util.Scanner;

public class b_12605 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       sc.nextLine();
       for(int i=0;i<num;i++)
       {
    	   String input = sc.nextLine();
    	   String[] arr = input.split(" ");
    	   System.out.print("Case #"+(i+1)+": ");
    	   for(int j=arr.length-1;j>=0;j--)
    	   {
    		   System.out.print(arr[j]+" ");
    	   }
    	   System.out.println();
       }
    }
}