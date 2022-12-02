public class string{
    public static void main(String[] args) {
        String a="madam";
        System.out.println(a);
        StringBuilder b= new StringBuilder();
        b.append(a);
        b.reverse();
        System.out.println(b); 
        System.out.println(a.length());
        System.out.println(a.charAt(0));
        System.out.println(a.charAt(4));
        if (a.charAt(0)==a.charAt(4)) {
            System.out.println("The Start and End letters of the word are same");
        }
        else
        {
            System.out.println("Different");
        }
    }
}