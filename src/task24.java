import java.util.Arrays;
import java.util.Scanner;

public class task24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int arraySize = sc.nextInt();
        System.out.println("Enter " + arraySize + " numbers:");
        int[] nums = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            nums[i] = sc.nextInt();
        }
        task24 ex24 = new task24();
        System.out.print("centered average :");
        System.out.println(ex24.centeredAverage(nums));
    }
    public int centeredAverage(int[] nums){
        int min=nums[0];
        int max=nums[0];
        int sum=0;
        for (int i=0;i<nums.length;i++){
            sum += nums[i];
            if (nums[i]<min){
                min= nums[i];
            }
            if (nums[i]>max){
                max= nums[i];
            }
        }
        return (sum-min-max)/(nums.length-2);
    }
}
