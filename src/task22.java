import java.util.Arrays;
import java.util.Scanner;

public class task22 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size: ");
        int arraySize= sc.nextInt();
        System.out.println("Enter " + arraySize + " numbers:");
        int[] nums=new int[arraySize];
        for (int i=0;i<arraySize;i++){
            nums[i]= sc.nextInt();
        }
        System.out.println("Enter a value: ");
        int value= sc.nextInt();
        task22 ex22=new task22();
        System.out.print("Not Alone :");
        System.out.println(Arrays.toString(ex22.notAlone(nums,value)));
    }
    public int[] notAlone(int[] nums,int value){
        for(int i=1;i<= nums.length-2;i++){
            if(nums[i]==value){
                if(nums[i-1]!=value && nums[i+1]!=value){
                    nums[i]=Math.max(nums[i-1],nums[i+1]);
                }
            }
        }
        return nums;
    }
}
