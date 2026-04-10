import java.util.Scanner;

public class task28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int arraySize = sc.nextInt();
        System.out.println("Enter " + arraySize + " numbers:");
        int[] nums = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            nums[i] = sc.nextInt();
        }
        task28 ex28 = new task28();
        System.out.print("has 2 2 or 4 4 :");
        System.out.println(ex28.either24(nums));
    }
    public boolean either24(int[] nums){
        boolean has22=false;
        boolean has44=false;
        for (int i=0;i< nums.length-1;i++){
            if(nums[i] == 2 && nums[i+1] == 2){
                has22= true;
            }
            if(nums[i] == 4 && nums[i+1] == 4){
                has44= true;
            }
        }
        return has22 ^ has44;
    }
}
