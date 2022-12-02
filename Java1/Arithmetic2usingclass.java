abstract class name
{
    int dx=10,dy=20;
}

class addi extends name
{
    void addition()
    {
      System.out.println("addition : "+(dx+dy));
    }
    void subtract()
    {
        System.out.println("subtraction : "+(dy-dx));
    }
    void divide()
    {
        System.out.println("division : "+(dy/dx));
    }
    void multiplication()
    {
        System.out.println("multiplication : "+(dx*dy));
    }
}

class Arithmetic2usingclass {
    public static void main(String[] args) {
        addi a=new addi();
        a.addition();
        a.subtract();
        a.divide();
        a.multiplication();
    }
}
