import java.util.*;

class Factorial{
public static void main(String[] args) {
    int a,b,c,d;
     Scanner ft= new Scanner(System.in);
     System.out.println("Ente the value of a :");
    a=ft.nextInt();
    c=1;
     
    for (int i = 1; i <= a; i++) {
        c=c*i;
    }
    System.out.println("The result of the factorial is :" +c);
    ft.close();

    //FIBONACCI SERIES

    b=0;
    d=1;

    System.out.println("The result of the factorial is :");
    System.out.println(+b);
    System.out.println(+d);
    for (int j = 1; j <= a/2; j++) {
        
        b=b+d;
        d=d+b;
        System.out.println(+b);
        if(j>=a/2)
        {
        System.out.println(+d);
        break;
        }
    }

}
}