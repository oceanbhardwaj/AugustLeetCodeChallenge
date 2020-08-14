class CombinationIterator {
   List<String> a;
    int i;
     String g;
    private void BitSat(String s,int x)
    {
        int n=s.length();
        int d=1<<n;
        for(int i=0;i<d;i++)
        {  g="";
            for(int j=0;j<n;j++)
            {
              if(( i & (1<<j))!=0) 
                g=g+s.charAt(j);  
            }
         if(g.length()==x)
             a.add(g);
        }
        Collections.sort(a);
        }
    
    
    
    
    
    
    
    
    
    public CombinationIterator(String characters, int combinationLength) {
        a=new ArrayList<String>();
                i=0;

        g="";
        BitSat(characters,combinationLength);
        
        
    }
    
    
    public String next() {
        return a.remove(0);
        
    }
    
    public boolean hasNext() {
        if(a.size()!=0)
            return true;
        else
            return false;
        
    }
    
  
        
    
}
