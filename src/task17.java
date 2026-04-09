import java.util.Scanner;

public class task17 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int arraySize= sc.nextInt();
        System.out.println("Enter " + arraySize + " numbers:");
        int[] nums=new int[arraySize];
        for (int i=0;i<arraySize;i++){
            nums[i]= sc.nextInt();
        }
        System.out.println("enter a value: ");
        int value=sc.nextInt();
        task17 ex17=new task17();
        System.out.print(value + "is everywhere :");
        System.out.println(ex17.isEverywhere(nums,value));
    }
    public boolean isEverywhere(int[] nums,int value){
        for (int i=0;i< nums.length-1;i++){
            if (nums[i]!=value && nums[i+1]!=value){
                return false;
            }
        }
        return true;
    }
}
