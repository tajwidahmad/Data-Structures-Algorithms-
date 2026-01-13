package backtraking;

public class subset {
    public static void main(String[] args) {
        String s1 = "abc";
        Allsubsets(s1, 0, "");
    }
    public static void Allsubsets(String s1,int i,String ans) {
        //base case..
        if (i==s1.length()) {
            //for printing null sunstring as it was not shown....
            if (ans.length()==0) {
                System.out.println("null");
            }
            else{
                System.out.println(ans);
                

            }
            return;            
        }
        //choice yes
        Allsubsets(s1, i+1, ans+s1.charAt(i));
        //choice no
        Allsubsets(s1, i+1, ans);
    }
}
