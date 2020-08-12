class Solution {
    public int titleToNumber(String s) {
        int n=s.length()-1;
       int base=1;
        int d=0;
        while(n>=0)
        {
         d=d+((int)s.charAt(n)-64)*base;
            base=base*26;
            n--;
        }
        return d;
    }
}