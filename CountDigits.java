import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) throws Exception 
    {
        //Scanner scan = new Scanner(System.in);
        //System.out.print("Please Enter The Number : ");
        //int number = scan.nextInt();
        //int result = countDigits(number); 
        //System.out.print("Output : "+result);
        System.out.println("Test Cases : ");
        System.out.println("1 : "+countDigits(123));
        System.out.println("2 : "+countDigits(0));
        System.out.println("3 : "+countDigits(-123));
    }

    public static int countDigits(int number)
    {   
        String str = Integer.toString(number);
        int i = 0;
        int count = 0;
        for(i=0;i<str.length();i++) 
        { 
            if(str.charAt(i)=='0'||str.charAt(i)=='1'||str.charAt(i)=='2'||str.charAt(i)=='3'||  
                str.charAt(i)=='4'||str.charAt(i)=='5'||str.charAt(i)=='6'||str.charAt(i)=='7'||
                str.charAt(i)=='8'||str.charAt(i)=='9')
            {   
                count ++;
            }   
        }
        return count;
    }
}
