import java.util.LinkedList;

class Solution {
    public boolean isHappy(int n) {

        int slow=n;
        int fast=nextNum(n);
        while(fast!=1 && slow !=fast){
            slow=nextNum(slow); // move one step forward
            fast=nextNum(nextNum(fast)); // move two steps forward
        }
        
        
        return fast == 1; // happy number if fast reaches 1

    }

    // Helper Function : used to find sum of squares of its number
    static int nextNum(int num){
        int sum=0;
        while(num>0){
            int rem=num%10; // get last digit
            sum=sum+rem*rem; // add square to sum
            // remove last digit
            num=num/10;


        }
        return sum;
    }
}