class Solution {
    static int findPosition(int N) {
        // code here
        if(N==0)return -1;
        if((N & N-1)!=0)return -1;
        int ans=(int)(Math.log(N)/Math.log(2));
        return ans+1;
    }
}