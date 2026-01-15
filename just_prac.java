public class just_prac {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7};
        int k=3;
        int start=0;
        int end=nums.length-1;
        while(start<end && start<k){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }//
}
