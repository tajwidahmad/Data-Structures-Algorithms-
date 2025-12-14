package recursion;

public class power {
    public static void main(String[] args) {
        System.out.println(x_t_p(2, 10));
        
    }
    public static int x_t_p(int x, int n) {
        if(n==1){
            return x;
        }
        int power_of_x=x*x_t_p(x, n-1);
        return power_of_x;
        
    }
}
