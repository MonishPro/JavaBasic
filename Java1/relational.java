import java.util.*;

public class relational {
    public static void main(String[] args)
    {
        int a,b;
        Scanner PIN= new Scanner(System.in);
        System.out.println("Enter the value for a and b: ");
        a = PIN.nextInt();
        b = PIN.nextInt();

        //Greater than Sign
        { 
        if (a>b)
        System.out.println("a is greater than b");

        else
        System.out.println("b is greater than a");
        }    

        //Utilization of Lower Than
        { 
            if (a<b)
            System.out.println("a is lower than b");
    
            else
            System.out.println("b is lower than a");
        }  
        
        { 
            if (a==b)
            System.out.println("a is equal to b");
    
            else
            System.out.println("b is not equal a");
        }  

        { 
            if (a!=b)
            System.out.println("a is not equal to b");
    
            else
            System.out.println("b is equal to a");
            }  
        PIN.close();
    }
}
