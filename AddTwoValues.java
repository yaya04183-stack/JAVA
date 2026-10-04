import java.util.Scanner;

public class AddTwoValues
{
    public static void main(String[] args) throws Exception
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please  Enter The Size Of Array : ");
        int size = scan.nextInt();
        int []arr = new int[size];
        for(int i=0;i<size;i++)
        {
            System.out.print("Please Enter The element["+(i+1)+"] : ");
            arr[i] = scan.nextInt();
        }
        System.out.print("Please Enter The target : ");
        int target = scan.nextInt();
        int []result = twoSum(arr,target);
        if(result[0]==-2 & result[1]==-2)
        {
            System.out.print("Output : []");
        }
        else
        {
            System.out.print("Output : ["+result[0]+","+result[1]+"]");
        } 
        
    }
    public static  int[] twoSum(int[] nums,int target)
    {
        int i = 0;
        int j = 0 ;
        int sum = 0;
        int flag = 1;
        int []arr = new int[2];
        for(i=0;i<nums.length;i++)
        {
            for(j=i+1;j<nums.length;j++)
            {
                sum = nums[i] + nums[j];
                if(sum == target)
                { 
                    flag = 0;
                    break;
                } 
            }
            if(flag == 0) break;
        }
        if(i == nums.length && j == nums.length)
        {   
            arr[0] = -2;
            arr[1] = -2;
        }
        else
        {
            arr[0] = i;
            arr[1] = j;
        }
        return arr;
    } 
}



