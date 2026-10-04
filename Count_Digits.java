import java.util.*;

public class Count_Digits 
{
    public static void main(String args[]) throws Exception
    {
        //Scanner scan = new Scanner(System.in);
        System.out.println("Test Cases : ");
        //int num = scan.nextInt();
        //int result = countDigits(num);
        //System.out.print("Output : "+result);
        System.out.println("1 : "+countDigits(123));
        System.out.println("2 : "+countDigits(0));
        System.out.println("3 : "+countDigits(-123));
    }
    public static int countDigits(int number)
    {
        if(number < 0)
            number = -number;
        else 
            number = number;
        int count = 0;
        int digit = 0;
        if(number == 0)
                count = 1;
        while (number > 0) 
        {  
            digit = number % 10;
            count++;
            number = number / 10;
        }
        return count;
    }
}