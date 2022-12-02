import java.util.*;

public class areaofcircle {
   public static void main(String[] args) {
    int a;
    float c;
    Scanner tri=new Scanner(System.in);
    System.out.println("Enter the value for radius : ");
    a = tri.nextInt();
    //a=radius
    c= 3.14F*a*a;

    System.out.print("The area of circle is : " +c );

    tri.close();
   }
        
    }