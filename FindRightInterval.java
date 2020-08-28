class Solution{
public int[] findRightInterval(int[][] intervals) {
    int result[]=new int[intervals.length];
    TreeMap<Integer,Integer> h=new TreeMap<>();
    for(int i=0;i<intervals.length;i++)
    {
        h.put(intervals[i][0],i);
    }
   for(int i=0;i<intervals.length;i++)
   {
       Map.Entry<Integer,Integer> entry=h.ceilingEntry(intervals[i][1]);
           if(entry!=null)
               result[i]=entry.getValue();
       else
           result[i]=-1;
   }
       
    return result;
    
    
    }}


