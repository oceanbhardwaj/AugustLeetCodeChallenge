class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer>a=new ArrayList<Integer>();
        HashSet<Integer> h=new HashSet<>();
        for(int i:nums)
        {
            if(h.contains(i))
                a.add(i);
            
            h.add(i);
        }
        return a;
    }
}