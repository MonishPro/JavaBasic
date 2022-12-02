 import java.io.*;

public class allnine {

    public static void main(String[] args)throws IOException {
        int a,sum=0,temp,r,c=0,rev=0,fact=1,b,e=0,f=1,g,p,k,flag=0;

        System.out.print("Enter the number :");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        a=Integer.parseInt(br.readLine());
        System.out.print("Enter the number for factorial and fibonacci series :");
        b=Integer.parseInt(br.readLine());
        System.out.print("Enter the number to check Prime :");
        p=Integer.parseInt(br.readLine());
        temp=a;
        while (a>0) {
            r=a%10;
            sum=sum*10+r;
            rev=rev+r;
            c=c+r*r*r;
            a=a/10;
        }

        System.out.println("The Reverse is :" +sum);
        if(temp==sum)
        {
            System.out.println("The number is Pallindrome");
        }
        else
        {
            System.out.println("The number is not Pallindrome");
        }

        System.out.println("The result is :" +c);

        if(temp==c)
        {
            System.out.println("The number is Armstrong");
        }
        else
        {
            System.out.println("The number is not Armstrong");
        }

        System.out.println("The sum of the digit of the number is :" +rev);
        for (int i = 1; i <= b; i++) {
            fact=fact*i;
        }
        System.out.println("The Factorial of the number is :" +fact);

        System.out.print("The Fibonacci series is : 0 1");
        for (int j = 3; j <= b; j++) {
            g=e+f;
            e=f;
            f=g;
            System.out.print(" "+g);
        }
        System.out.println(" ");
        for ( k = 2; k < p; k++) {

            if(p%k==0)
        {
            System.out.println("The number is not Prime");
            flag=1;
            break;
        }
        }
        if(flag==0)
        {
             System.out.println("The number is Prime");
        }
    }
}
