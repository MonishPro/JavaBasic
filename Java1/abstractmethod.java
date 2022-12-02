abstract class abs {
    int a=10,b=20;
}
class ab extends abs {
    void show()
    {
        System.out.println(a+b);
    }
}
public class abstractmethod {
    public static void main(String[] args) {
        ab a=new ab();
        a.show();
    }
}
