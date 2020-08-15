class Solution {
    public int longestPalindrome(String s) {
        if(s.length()==0)
            return 0;
        HashMap<Character,Integer> h=new HashMap<>();
        int sum=0;
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            h.put(s.charAt(i),h.getOrDefault(s.charAt(i),0)+1);
        }
        for(char i:h.keySet())
        {
            if((h.get(i))%2==0)
            {
                sum=sum+h.get(i);
            }
            else
            {   count++;
                sum+=h.get(i)-1;
            }
        }
        if(count>0)
        sum= sum+1;
        return sum;
    }
}