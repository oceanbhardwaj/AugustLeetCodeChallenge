class Solution {
    public List<Integer> pancakeSort(int[] A) {
        ArrayList<Integer> a=new ArrayList<>();
        int n=A.length;
        for(int curr_size=n-1;curr_size>=0;curr_size--)
        {
            int mi=find_max(A,curr_size);
            if(mi!=curr_size)
            {
                flip(A,mi);
                a.add(mi+1);
                a.add(curr_size+1);
                flip(A,curr_size);
            }
        }
        
        return a;
    }
    static void flip(int A[],int n)
    {
        int start=0;
        int end=n;
        while(start<end)
        {
            int temp=A[start];
            A[start]=A[end];
            A[end]=temp;
            start++;
            end--;
        }
    }
    
    static int find_max(int A[],int n)
    {
        int max=Integer.MIN_VALUE;
        int index=0;
        for(int i=0;i<=n;i++)
        {
            if(A[i]>max)
            { max=A[i];
             index=i;}
            
        }
        return index;
    }
}