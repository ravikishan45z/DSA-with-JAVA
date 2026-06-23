package Recursion;

public class uniquePaths {

    //! Leetcode -- Unique Paths.
    public static void main(String[] args) {
        System.out.println("Unique Paths : " +uniquePath(2,2));
    }
    public static int uniquePath(int m, int n){
        if( m== 1 && n == 1) return 1;
        if(m == 0 || n == 0) return 0;
        return uniquePath(m, n-1) + uniquePath(m-1, n);
    }
    //? It will give TimeLimitExcleed for larger number.
}
