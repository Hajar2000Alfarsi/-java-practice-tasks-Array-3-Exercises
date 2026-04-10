import java.util.Scanner;

public class tsak26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int arraySize = sc.nextInt();
        System.out.println("Enter " + arraySize + " numbers:");
        int[] nums = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            nums[i] = sc.nextInt();
        }
        tsak26 ex26 = new tsak26();
        System.out.print("more 1 or 4 :");
        System.out.println(ex26.more14(nums));
    }
    public boolean more14(int[] nums){
        int count1=0;
        int count4=0;
        for (int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count1++;
            }
            if (nums[i]==4){
                count4++;
            }
        }
        return count1 > count4;
    }
}
