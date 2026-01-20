class Solution {
    public int[] solution(int n, int m) {
        int gcd = getGcd(n, m);
        int lcm = (n * m) / gcd;
        
        return new int[]{gcd, lcm};
    }
    

    private int getGcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
