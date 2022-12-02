import java.io.*;
class Palindrome {
    public static void main(String[]args) throws IOException {
        int x,sum=0,temp,r,i=0;
        System.out.print("Enter any number :");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        x=Integer.parseInt(br.readLine());
        temp=x;
          while (x>0) {
            r=x%10;
            sum=(sum*10)+r;
            x=x/10;
            i++;
          }
          System.out.println("There are total "+i+" digits present in the number");
          if(temp==sum)    
          System.out.println("palindrome number ");    
         else    
          System.out.println("not palindrome");    
    }
}