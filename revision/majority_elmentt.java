package revision;

public class majority_elmentt {
    public static void main(String[] args) {
        int arr[]={1,2,2,3,3,3,3,4};
        System.out.println(max_times(arr));
        
    }
    public static int max_times(int arr[]) {
        return arr[arr.length/2];
        
    }
}
