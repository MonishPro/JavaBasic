import java.util.*;

public class Switch{
    public static void main(String[] args)
    {
        int a;
        Scanner Swi = new Scanner(System.in);
        System.out.println("Enter the value for a : ");
        a = Swi.nextInt();

        switch(a)
        {
            case 1 : System.out.println("One");
            break;

            case 2 : System.out.println("Two");
            break;

            case 3 : System.out.println("Three");
            break;

            case 4 : System.out.println("Four");
            break;

            case 5 : System.out.println("Five");
            break;

            default : System.out.println("Invalid Number");
    
        }
        Swi.close();
    }
}
