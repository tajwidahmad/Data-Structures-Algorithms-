package Divide;

public class Search_rotated_sorted {
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int target=0;
        System.out.println(search_idx(arr, target, 0, arr.length-1));
    }
    public static int search_idx(int arr[],int target,int si,int ei) {
        if (si>ei) {  // base case
            return -1;
        }
        int mid = si+(ei-si)/2;
        // check if the mid is the target
        if (arr[mid]==target) {
            return mid;
        }
        // check for the line 01
        if (arr[si]<=arr[mid]) {
            //left of line 01
            if (arr[si]<=target && target<=arr[mid]) {
                return search_idx(arr, target, si, mid-1);
            }
            else{
                // right of line 01
                return search_idx(arr, target, mid+1, ei);
            }
        }
        //element is on line 02
        else{
            //right of line 02
            if (arr[mid]<=target && target<=arr[ei]) {
                return search_idx(arr, target, mid+1, ei);
            }
            else{
                return search_idx(arr,target,si,mid-1);
            }
            
        }
        
    }
}
