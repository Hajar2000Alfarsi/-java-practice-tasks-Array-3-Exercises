import java.util.Scanner;

public class task25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int arraySize = sc.nextInt();
        System.out.println("Enter " + arraySize + " numbers:");
        int[] nums = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            nums[i] = sc.nextInt();
        }
        task25 ex25 = new task25();
        System.out.print("has 2 and 2 :");
        System.out.println(ex25.has22(nums));
    }
    public boolean has22(int[] nums){
        for (int i=0;i<nums.length-1;i++){
            if (nums[i]==2 && nums[i+1]==2){
                return true;
            }
        }
        return false;
    }
}
