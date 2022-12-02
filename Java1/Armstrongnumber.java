import java.io.*;
public class Armstrongnumber {

    public static void main(String[] args) throws IOException {

        int x,sum=0,temp,r,i=0,m=0;
        System.out.print("Enter any number :");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        x=Integer.parseInt(br.readLine());
        temp=x;
          while (x>0) {
            r=x%10;
            sum=(sum*10)+r;
            x=x/10;
            m=r*r*r+m;
            i++;
          }
          System.out.println("There are total "+i+" digits present in the number"); //Exception ,and its dispensable
          
          if (m==temp) {
            System.out.println("The number is Armstrong");
          } else {
            System.out.println("The number isn't Armstrong");
          }
    }
}