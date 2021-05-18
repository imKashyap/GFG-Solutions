class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        //Your code here
        Set<Integer> s= new HashSet<>();
        for(int i=0;i<a.length;i++)
            s.add(a[i]);
        for(int i=0;i<b.length;i++)
            s.add(b[i]);
            return s.size();
    }
}