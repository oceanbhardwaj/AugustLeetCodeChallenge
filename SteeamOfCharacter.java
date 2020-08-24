class StreamChecker {
   class Trie
   {
       public Trie[] children;
       public boolean endOfWord;
       public Trie()
    {
        children =new Trie[26];
        endOfWord=false;
    }
   
    
    public void insert(String s)
    {
        Trie t=this;
        for(char c:s.toCharArray())
        {
            if(t.children[c-'a']==null)
            
                t.children[c-'a']=new Trie();
                t=t.children[c-'a'];
                
                
        }  
            t.endOfWord=true;
            
        
        
        
        
        
        
    }
    public boolean search(Deque<Character> s)
    {
        Trie t=this;
        for(char c:s)
        {
            if(t.children[c-'a']==null)
                return false;
            t=t.children[c-'a'];
           if(t.endOfWord)
               return true;
        }
        return false;
        
    }
    
    
   }
     public Trie t=new Trie();
      public Deque<Character> stream=new LinkedList<>();
        
    public StreamChecker(String[] words) {
       for(String w:words)
       {
           String g=new StringBuilder(w).reverse().toString();
           t.insert(g);
       }
        
        
        
    }
    
    public boolean query(char letter) {
        stream.addFirst(letter);
        return t.search(stream);
        
    }
}

/**
 * Your StreamChecker object will be instantiated and called as such:
 * StreamChecker obj = new StreamChecker(words);
 * boolean param_1 = obj.query(letter);
 */