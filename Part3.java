import java.security.Signature;
import java.util.Scanner;

public class Part3 {
    public static void main(String[] args) {
        Scanner rectangle=new Scanner(System.in);
        System.out.println("Inter the width of the rectangle ");
        int x= rectangle.nextInt();

        System.out.println("Inter the length of the rectangle");
        int y= rectangle.nextInt();

        System.out.println("the area of rectangle: "+ (x*y));
        System.out.println("the perimeter of rectangle: "+ 2*(x+y));

    }
}
