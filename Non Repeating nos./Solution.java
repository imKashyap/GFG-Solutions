class Solution
{
    public int[] singleNumber(int[] nums)
    {
        // Code here
        int ans=0;
        for(int i=0;i<nums.length;i++)
            ans=ans^nums[i];
        int cpy= ans;
        int id=0;
        while(cpy!=0){
            int t=1<<id;
            if((cpy & t)!=0)break;
            id++;
        }
        List<Integer> l= new ArrayList<>();
         for(int i=0;i<nums.length;i++){
             int t=1<<id;
             if((nums[i] & t)==(ans & t))
                l.add(nums[i]);
         }
         for(int i=0;i<l.size();i++)
            ans= ans^l.get(i);
        int[] arr= new int[2];
        arr[0]=Math.min(ans, ans^cpy);
        arr[1]=Math.max(ans, ans^cpy);
        return arr;
    }
}