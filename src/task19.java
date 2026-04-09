import java.util.Scanner;

public class task19 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int arraySize= sc.nextInt();
        System.out.println("Enter " + arraySize + " numbers:");
        int[] nums=new int[arraySize];
        for (int i=0;i<arraySize;i++){
            nums[i]= sc.nextInt();
        }
        task19 ex19=new task19();
        System.out.print("have 3 :");
        System.out.println(ex19.haveThree(nums));
    }
    public boolean haveThree(int[] nums){
        int countNum3=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]==3) {
                countNum3++;
            }
            if(i<nums.length-1 && nums[i]==3 && nums[i+1]==3){
                return false;
            }
        }
        return countNum3 == 3;
    }
}
