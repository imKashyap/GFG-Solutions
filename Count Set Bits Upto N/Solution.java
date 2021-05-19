class Solution{
    
    //Function to return sum of count of set bits in the integers from 1 to n.
    public static int countSetBits(int n){
    
        // Your code here
        if(n==0)return 0;
        int p=(int)(Math.log(n)/Math.log(2));
        int upto=(1<<(p-1))*p;
        int msb=n-(1<<p)+1;
        int ans=upto+msb+countSetBits(n-(1<<p));
        return ans;
        
    }
}