class Solution {
    public int hIndex(int[] citations) {
        
        Arrays.sort(citations);
        int n=citations.length;
        int low=0;
        int high=citations.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(citations[mid]==n-mid)
                return citations[mid];
            else if(citations[mid]<n-mid)
                low=mid+1;
            else
                high=mid-1;
                
                
            
        }
        return n-low;
    }
}