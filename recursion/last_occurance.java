package recursion;

public class last_occurance {
    public static void main(String[] args) {
        int arr[]={8,3,6,9,5,10,2,5,3};
        System.out.println(lastidx(arr, 5, 0));
    }
    public static int lastidx(int arr[],int key,int i) {
        if (i==arr.length) {
            return -1;
            
        }
        int found_idx=lastidx(arr, key, i+1);
        if (found_idx != -1) {
            return found_idx;
            
        }
        if (arr[i]==key) {
            return i;
            
        }
        return -1;
        
        
    }
}
