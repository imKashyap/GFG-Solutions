class Solution{
    
    // Function to find number of bits needed to be flipped to convert A to B
    public static int countBitsFlip(int a, int b){
        
        // Your code here
        int ans= a^b;
        int count=0;
        while(ans!=0){
            count++;
            ans= ans& ans-1;
        }
        return count;
    }
    
    
}