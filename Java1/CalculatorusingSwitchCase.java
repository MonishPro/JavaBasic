
import java.io.*;
public class CalculatorusingSwitchCase {
    public static void main(String[] args) throws IOException
    {
        int a,b,c,result;
        System.out.println("Enter the value for a and b:");
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        a=Integer.parseInt(br.readLine());
        b=Integer.parseInt(br.readLine());
        System.out.println("1-Addition , 2-Subtraction , 3-Multiplication, 4-Division");
        c=Integer.parseInt(br.readLine());

        switch (c) {
            case 1:
                result=a+b;
                System.out.println("The result is:"+result);
                break;

                case 2:
                result=a-b;
                System.out.println("The result is:"+result);
                break;

                case 3:
                result=a*b;
                System.out.println("The result is:"+result);
                break;

                case 4:
                result=a/b;
                System.out.println("The result is:"+result);
                break;
                
        
            default:System.out.println("Invalid Input");
                break;
        }
    }
}

