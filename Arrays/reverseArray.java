public class reverseArray {
    public static void main(String[] args) {
        int[] num = {2,5,3,6,8};
        int left = 0;
        int right= num.length-1;
        for(int i=0;i<num.length;i++){
            if(left<right){
                int temp = num[right];
                num[right]= num[left];
                num[left]=temp;
            }
            left++;
            right--;
        }
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
}
