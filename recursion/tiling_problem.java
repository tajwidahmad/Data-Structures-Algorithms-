package recursion;

public class tiling_problem {
    public static int ways_to_cover(int n) {
        if(n==0 || n==1){
            return 1;
        }
        // vertical
        int fnm1=ways_to_cover(n-1);
        // horizontal
        int fnm2=ways_to_cover(n-2);
        int ways=fnm1+fnm2;
        return ways;
    }
    public static void main(String[] args) {
        System.out.println(ways_to_cover(3));
    }
    
}
