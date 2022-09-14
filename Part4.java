import java.util.Scanner;

public class Part4
{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter three number: ");
        int x=input.nextInt();
        int s=input.nextInt();
        int z=input.nextInt();

        System.out.println("the averge is: " + (x+s+z)/3);
    }
}