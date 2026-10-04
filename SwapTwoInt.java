import java.util.*;

public class SwapTwoInt
{   
    public static void main(String str[]) throws Exception
    {
        //Scanner scan = new Scanner(System.in);
        //System.out.print("Please Enter The First Number : ");
        //int first = scan.nextInt();
        //System.out.print("Please Enter The Second Number : ");
        //int second = scan.nextInt();
        System.out.println("Test Cases : ");
        int []result1 = swapNumbers(10,20);
        System.out.print("Output : ["+result1[0]+","+result1[1]+"]");
        int []result2 = swapNumbers(-10,-20);
        System.out.println();
        System.out.print("Output : ["+result2[0]+","+result2[1]+"]");
    }
    public static int[] swapNumbers(int first, int second)
    {   
        int [] result = new int[2];
        // first = first + second;
        // second = first - second;
        // first = first - second;
        result[1] = first;
        result[0] = second;
        return result;
    }
}