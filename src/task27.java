import java.util.Arrays;
import java.util.Scanner;

public class task27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        task27 ex27 = new task27();
        System.out.print("more 1 or 4 :");
        System.out.println(Arrays.toString(ex27.fizzArray2(n)));
    }
    public String[] fizzArray2(int n){
        String[] result=new String[n];
        for (int i=0;i<n;i++){
            result[i]=String.valueOf(i);
        }
        return result;
    }
}
