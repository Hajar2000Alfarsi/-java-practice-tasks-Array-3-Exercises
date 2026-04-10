import java.util.Arrays;
import java.util.Scanner;

public class task23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int arraySize = sc.nextInt();
        System.out.println("Enter " + arraySize + " numbers:");
        int[] nums = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            nums[i] = sc.nextInt();
        }
        task23 ex23 = new task23();
        System.out.print("zerom Max :");
        System.out.println(Arrays.toString(ex23.zeroMax(nums)));
    }
    public int[] zeroMax(int[] nums){
        for (int i=0;i< nums.length;i++){
            if(nums[i]==0){
                int maxOdd=0;
                for (int j=i+1;j< nums.length;j++){
                    if(nums[j]%2!=0 && nums[j]>maxOdd){
                        maxOdd= nums[j];
                    }
                }
                nums[i]=maxOdd;
            }
        }
        return nums;
    }
}
