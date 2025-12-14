package recursion;

public class power {
    public static void main(String[] args) {
        // System.out.println(x_t_p(2, 10));
        System.out.println(optimzed_power(2, 5));
        
    }
    // public static int x_t_p(int x, int n) {
    //     if(n==1){
    //         return x;
    //     }
    //     int power_of_x=x*x_t_p(x, n-1);
    //     return power_of_x;
        
    // }

    //################### optimized ######################
    public static int optimzed_power(int x,int n) {
        // base case
        if (n==0) {
            return 1;
        }
        // int final_power=optimzed_power(x, n/2)*optimzed_power(x, n/2);
        // ######## more optimixe it
        int half_power=optimzed_power(x, n/2);
        int half_power_square=half_power*half_power;

        // odd hoga agar hamara n ->
        if (n%2!=0) {
            return x*half_power_square;
            
        }
        return half_power_square;
        
    }
}
