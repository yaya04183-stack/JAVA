import java.util.*;

public class CompressString {
    public static void main(String str[]) throws Exception
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please Enter The String : ");
        String string = scan.nextLine();
        StringBuilder sb = new StringBuilder(string);
        String res = compressString(sb);
        System.out.println("Output : "+res);
    
    }
    public static String compressString(StringBuilder str)
    {   
        
        StringBuilder result = new StringBuilder();
        if(str.isEmpty())
        {
            return result.toString();
        }
        else if(str.length() == 1)
        {
            result = str;
            result.append(1);
        }
        else 
        {   
            int count = 1;
            for(int i=0;i<str.length();i++)
            {
                if(i<str.length() - 1 && str.charAt(i) == str.charAt(i+1))
                {
                    count ++;
                }
                else 
                {
                    result.append(str.charAt(i));
                    result.append(count);
                    count = 1;
                }
            }
        }
        return result.toString();
    }
}