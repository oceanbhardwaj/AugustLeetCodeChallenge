class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> a=new ArrayList<String>();
        for(int i=1;i<=n;i++)
        {
            if(i%15==0)
            {
                a.add("FizzBuzz");
            }
             else if(i%3==0)
            {
                a.add("Fizz");
            }
            else if(i%5==0)
            {
                a.add("Buzz");
            }
            
            else
            {
                a.add(String.valueOf(i));
            }
        }
        return a;
    }
}