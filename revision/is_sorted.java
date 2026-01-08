package revision;

public class is_sorted {
    // public static void main(String[] args) {
    //     int arr[]={1,2,3,4,5};
    //     System.out.println(checking_sorted(arr, 0));
    // }
    // public static boolean checking_sorted(int arr[],int idx) {
    //     // base case
    //     if (idx==arr.length-1) {
    //         return true;
    //     }
    //     if (arr[idx]>arr[idx+1]) {
    //         return false;
    //     }
    //     return checking_sorted(arr, idx+1);
        
    // }
    // first occurence...
    public static void main(String[] args) {
        int arr[]={3,4,6,8,2,6,1,5};
        System.out.println(first_time(arr, 0, 6));
    }
    public static int first_time(int arr[],int idx,int target) {
        // base case
        if (idx==arr.length-1) {
            return -1;
        }
        if (arr[idx]==target) {
            return idx;
        }
        return first_time(arr, idx+1, target);
    }
}
