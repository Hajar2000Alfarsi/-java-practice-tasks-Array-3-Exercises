import java.util.Scanner;

public class task20 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int arraySize= sc.nextInt();
        System.out.println("Enter " + arraySize + " numbers:");
        int[] nums=new int[arraySize];
        for (int i=0;i<arraySize;i++){
            nums[i]= sc.nextInt();
        }
        task20 ex20=new task20();
        System.out.print("Triple up :");
        System.out.println(ex20.tripleUp(nums));
    }
    public boolean tripleUp(int[] nums){
        for(int i=0;i<nums.length-2;i++){
            if (nums[i]+1==nums[i+1] && nums[i+1]+1==nums[i+2]){
                return true;
            }
        }
        return false;
    }
}
