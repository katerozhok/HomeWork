import java.util.Scanner;
 
public class HomeTask {
    public static void main(String[] args) {
    Scanner keyboard= new Scanner(System.in);
        double a, b, c, d, x1, x2;

       
        System.out.println("Введите а: ");
        a = keyboard.nextDouble();

        System.out.println("Введите b: ");
        b = keyboard.nextDouble();

        System.out.println("Введите c: ");
        c = keyboard.nextDouble();

        d = Math.pow(b, 2) - (4*a*c);
        if (d>0) {
            x1 = ((-1)*b + Math.sqrt(d)) /(2*a);
            x2 = ((-1)*b - Math.sqrt(d)) /(2*a);
            System.out.println("x1 = " + x1 + " x2 = " + x2);
        }
        else if (d == 0) {
            x1 = ((-1)*b + Math.sqrt(d))/(2*a);
            System.out.println("x1, x2 = " + x1);
        }
        else
        System.out.println("Нет решения, D меньше нуля");
    }
}
