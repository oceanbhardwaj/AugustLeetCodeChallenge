class Solution {
    public String toGoatLatin(String S) {
        String s[]=S.split(" ");
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<s.length;i++)
        {
            String s1=s[i];
           char c=s1.charAt(0);
            if(isVowel(c))
            {
                
                sb.append(s1);
                 sb.append("ma");
                for(int j=0;j<i+1;j++)
                    sb.append("a");
                
                
            }
            else
            { 
                String s2=s[i];
                String s3=s2.substring(1);
                sb.append(s3);
                sb.append(String.valueOf(s2.charAt(0)));
                sb.append("ma");
                for(int j=0;j<i+1;j++)
                {
                    sb.append("a");
                    
                }
                
                
                
                
                
                
                
            }
            sb.append(" ");
        }
            
            
            String ans=sb.toString();
            return ans.trim();
            
            
            
            
            
            
            
            
        
        
    }
    static boolean isVowel(char c)
    {
        if(c=='a'|| c=='e' || c=='i' || c=='o' || c=='u' || c=='A'|| c=='E' || c=='I' || c=='O' || c=='U')
            return true;
        return false;
    }
}