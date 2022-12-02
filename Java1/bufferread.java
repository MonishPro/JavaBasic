import java.io.*;

public class bufferread {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the value for a:");
        int a=Integer.parseInt(br.readLine());
        System.out.println("The value is :"+a);
    }
}
