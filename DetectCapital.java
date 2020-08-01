class Solution {
    public boolean detectCapitalUse(String word) {
        int flag=1;
       String lower=word.toLowerCase();
        String upper=word.toUpperCase();
        if(word.equals(lower))
            return true;
        if(word.equals(upper))
            return true;
        if(Character.isUpperCase(word.charAt(0)))
            flag=0;
        for(int i=1;i<word.length();i++)
        {
            if(Character.isUpperCase(word.charAt(i)))
            {  flag=1;
            break;}
        }
        if(flag==0)
            return true;
        
        
        return false;
        
        
    }
}