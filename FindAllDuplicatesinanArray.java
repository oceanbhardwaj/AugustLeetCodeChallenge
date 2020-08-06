class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer>a=new ArrayList<Integer>();
        int n=nums.length;
       
        for(int i=0;i<n;i++)
        {
            int curr=Math.abs(nums[i]);
            nums[curr-1]=-nums[curr-1];
        if(nums[curr-1]>0)
            a.add(Math.abs(nums[i]));
        }
        
        
        
      return a;  
        
        
        
        
    }
}