import java.util.*;

public class Conditional {
    public static void main(String[] args)
    {
        int a,b;
        Scanner Con= new Scanner(System.in);
        System.out.print("Enter any two numbers : ");

        a = Con.nextInt();
        b = Con.nextInt();

        {
            if(a>b)
            System.out.print("a is greater than b");

            else if(a==b)
            System.out.print("a is equal to b");

            else
            System.out.print("b is greater than a");
        }

        Con.close();
    }
}
