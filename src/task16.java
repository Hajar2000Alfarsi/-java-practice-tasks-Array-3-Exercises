import java.util.Scanner;

public class task16 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int arraySize= sc.nextInt();
        System.out.println("Enter " + arraySize + " numbers:");
        int[] nums=new int[arraySize];
        for (int i=0;i<arraySize;i++){
            nums[i]= sc.nextInt();
        }
        task16 ex16=new task16();
        System.out.print("only 1 and 4 :");
        System.out.println(ex16.only14(nums));
    }
    public boolean only14(int[] nums){
        int count=0;
        for (int i=0;i< nums.length;i++){
            if(nums[i]==1 || nums[i]==4){
                count++;
            }
        }
        if(count== nums.length){
            return true;
        }
        return false;
    }
}
