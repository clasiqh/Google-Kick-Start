import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int t=1;t<=tc;t++){
            
            int N = sc.nextInt();
            int B = sc.nextInt();

            int count = 0;
            int[] arr = new int[N];
            
            for(int i=0;i<N;i++)
                arr[i] = sc.nextInt();
            Arrays.sort(arr);

            for(int num : arr){
                if(B<num)
                    break;
                B-= num;
                count++;
            }
            System.out.println("Case #"+t+": "+count);
        }
        sc.close();
    }
}