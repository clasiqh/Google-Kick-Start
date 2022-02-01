import java.util.*;

class Solution {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int t=1;t<=tc;t++){

            //take inputs
            int length = sc.nextInt();
            int k = sc.nextInt();
            String str = sc.next();

            //set values
            int left = 0;
            int right = length-1;
            int score = 0;
            
            //kinda like palindrome
            while(left<right){
                if(str.charAt(left)!=str.charAt(right))
                    score++;
                left++;
                right--;
            }

            //print stuff
            System.out.println("Case #"+ t +": "+ Math.abs(k-score));
        }
        sc.close();
    }
}

