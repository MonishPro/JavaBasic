import java.util.*;

/*interface client
{
    void max();
    void add();
}*/
class New1  {
    int a,b;
    public void max()
    {
        Scanner Sc=new Scanner(System.in);
        a=Sc.nextInt();
        b=Sc.nextInt();
        Sc.close();
    }
    public void add()
    {
        System.out.println(a+b);
    }
}
public class Interface {
    public static void main(String[] args) {
        New1 c=new New1();
        c.max();
        c.add();
    }
}