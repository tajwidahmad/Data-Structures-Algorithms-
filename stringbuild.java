public class stringbuild {
    public static void main(String[] args) {
        StringBuilder output=new StringBuilder("");
        boolean map[]=new boolean[26];
        String str="acccccd";
        remove_repeated(str, 0, map, output);
    }
    public static void remove_repeated(String str,int idx , boolean map[],StringBuilder output) {
        //base cse-:>
        if (idx==str.length()) {
            System.out.println(output);
            return;
            
        }
        char curr_char=str.charAt(idx);
        if (map[curr_char-'a']==true) {
            remove_repeated(str, idx+1, map, output);
        }
        else{
            map[curr_char-'a']=true;
            remove_repeated(str, idx+1, map, output.append(curr_char));
        }
    }
}
