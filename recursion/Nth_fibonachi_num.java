package recursion;

public class Nth_fibonachi_num {
    public static void main(String[] args) {
        System.out.println(nth_fibo(5 ));
        
    }
    public static int nth_fibo(int n) {
        if (n==0) {
            return 0;
        }
        else if(n==1){
            return 1;
        }
        int fibo_n=nth_fibo(n-1)+nth_fibo(n-2);
        return fibo_n;
    }
}
