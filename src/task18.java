import java.util.Scanner;

public class task18 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int arraySize= sc.nextInt();
        System.out.println("Enter " + arraySize + " numbers:");
        int[] nums=new int[arraySize];
        for (int i=0;i<arraySize;i++){
            nums[i]= sc.nextInt();
        }
        task18 ex18=new task18();
        System.out.print("has 7 and 7 :");
        System.out.println(ex18.has77(nums));
    }

    public boolean has77(int[] nums){
        for (int i=0;i<nums.length-1;i++){
            if(nums[i]==7 && nums[i+1]==7){
                return true;
            }
            if(i<nums.length-2 && nums[i]==7 && nums[i+2]==7){
                return true;
            }
        }
        return false;
    }
}
