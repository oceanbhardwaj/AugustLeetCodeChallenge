class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int count=0;
        if(intervals.length==0)
            return 0;
        Integer arr[][]=new Integer[intervals.length][2];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<2;j++)
            {
                arr[i][j]=intervals[i][j];
            }
        }
        Arrays.sort(arr,new Comparator<Integer[]>()
                    {
                        public int compare(Integer a[],Integer b[] )
                        {
                            if(a[0]==b[0])
                                return a[1]-b[1];
                            return a[0]-b[0];
                        }
                    });
        int start=arr[0][0];
        int end=arr[0][1];
        for(int i=1;i<arr.length;i++)
        {
            
            
                int s=arr[i][0];
            int e=arr[i][1];
            
            if(end>=e)
            { int diff1=end-start;
             int diff2=e-s;
             if(diff2<diff1)
             {count++;
                end=e;
                start=s;}
             else 
             {
                 count++;
             }
            }
             else if(end<=s)
             {
                 end=e;
                start=s;
             }
            else if(end>s)
            {
                count++;
            }
            
            
        }
        
        return count;
        
    }
}