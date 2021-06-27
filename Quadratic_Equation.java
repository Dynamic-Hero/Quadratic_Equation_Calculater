import java.util.Scanner;
public class Quadratic_Equation {
    public static void main(String[] args) {
        int a , b , c , d = 0 ;
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter the value");
        System.out.println();
        System.out.print("a = ");
        a = sc.nextInt();
        System.out.print("b = ");
        b = sc.nextInt();
        System.out.print("c = ");
        c = sc.nextInt();
        d = (int)Math.pow(b,2) + (4 * (a*c));
        if(d == 0)
            System.out.println(d + " the roots are \" real and equal \"");
        else if(d > 0)
            System.out.println(d + " the roots are \" real and unequal \"");
        else if(d < 0)
            System.out.println(d + " the roots are \" imaginary (not real) \" ");
    }
}
