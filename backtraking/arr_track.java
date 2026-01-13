package backtraking;

public class arr_track {
    public static void main(String[] args) {
        int arr[]= new int[5];
        assign_values(arr, 0, 1);
        printarr(arr);
    }
    public static void assign_values(int arr[],int i,int value) {
        if (i==arr.length) {
            printarr(arr);
            return;
        }
        arr[i]=value;
        assign_values(arr, i+1, value+1);
        arr[i]=arr[i]-2;

    }
    public static void printarr(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
