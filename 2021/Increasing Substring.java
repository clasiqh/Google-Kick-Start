import java.util.*;

class Solution {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int t=1;t<=tc;t++){

            //take inputs
            int length = sc.nextInt();
            String str = sc.next();

            // use array or just print count during loop
            int[] arr = new int[length]; 

            int count = 0;
            for(int i=0;i<length;i++){
                if( i==0 || str.charAt(i-1)<str.charAt(i)){
                    arr[i] = ++count;
                    continue;
                }
                count = 1;
                arr[i] = count;
            }

            //print stuff
            System.out.print("Case #"+ t +": ");

            //we don't want space after the last one
            for(int i=0; i<length-1;i++)
                System.out.print(arr[i]+" ");
            System.out.println(arr[length-1]);
        }
        sc.close();
    }
}
