public class fact_using_recur {
    public static int fact_of_num(int n) {
         if(n==0){
            return 1;
        }
        int fact=n*fact_of_num(n-1);
        return fact;
       
    }
    public static void main(String[] args) {
        System.out.println(fact_of_num(5));
}
}