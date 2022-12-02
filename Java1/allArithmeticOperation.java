
import java.util.*;
class Game 
{
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the 2 numbers :");
        int a,b,a0,a1,a2,a3,a4;
        a = myObj.nextInt();
        b = myObj.nextInt();

        a0=a+b;
        a1=a-b;
        a2=a*b;
        a3=a/b;
        a4=a%b;

        System.out.println("The result is " +a0);
        System.out.println("The result is " +a1);
        System.out.println("The result is " +a2);
        System.out.println("The result is " +a3);
        System.out.println("The result is " +a4);
        myObj.close();
    }
}
