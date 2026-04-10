import java.util.Arrays;
import java.util.Scanner;

public class task21 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int arraySize= sc.nextInt();
        System.out.println("Enter " + arraySize + " numbers:");
        int[] nums=new int[arraySize];
        for (int i=0;i<arraySize;i++){
            nums[i]= sc.nextInt();
        }
        task21 ex21=new task21();
        System.out.print("Ten run :");
        System.out.println(Arrays.toString(ex21.tenRun(nums)));
    }
    public int[] tenRun(int[] nums){
        int divisibleBy10=0;
        for (int i=0;i< nums.length;i++){
            if(nums[i]%10 == 0){
                divisibleBy10=nums[i];
            }
            if (divisibleBy10%10 == 0 && divisibleBy10!=0){
                nums[i]=divisibleBy10;
            }
        }
        return nums;
    }
}
