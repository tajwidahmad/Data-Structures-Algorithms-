package recursion;

public class assignmentq1 {
    public static void main(String[] args) {
        int arr[]={3,2,4,5,6,2,7,2,2};
        int key=2;
        repeated(arr, key, 0);

    }
    public static void repeated(int arr[],int key,int idx) {
        if (idx==arr.length) {
            return;
        }
        if (arr[idx]==key) {
            System.out.println(idx);
        }
        repeated(arr,key,idx+1);
    }
    
}
