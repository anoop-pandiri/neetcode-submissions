class Solution {
    public boolean isHappy(int n) {
        Set<Integer> s = new HashSet<Integer>();
        while(n!=1){
            n = sumOfSquares(n);
            if(s.contains(n))
                return false;
            else
                s.add(n);
        }
        return true;
    }

    int sumOfSquares(int n) {
        int res=0;
        while(n!=0) {
            int x = n%10;
            res+=x*x;
            n/=10;
        }
        return res;
    }
}
