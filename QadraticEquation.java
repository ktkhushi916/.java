import java.util.Scanner;
import java.lang.Math;

class QuadraticEquation {
    public static void main(String[] args) {
        int a,b,c;
        double r1,r2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a:");
        a = sc.nextDouble();
         System.out.println("Enter the value of b:");
        b = sc.nextDouble();

        System.out.println("Enter the value of c:");
        c = sc.nextDouble();


        if (a == 0) {
            System.out.println("Not a Quadratic Equation");
            a=sc.nextInt();
        }

        
        float d = (b * b) - (4 * a * c); 
        if (d == 0) {
            r1 = -b / (2 * a);

            System.out.println("Roots are Real and Equal");
            System.out.println("Root1 = " + r1 + "Root2 = " + r1);
        } 
        else if (d > 0) {
            r1 = (-b + Math.sqrt(d)) /(double) (2 * a);
            r2 = (-b - Math.sqrt(d)) / (double)(2 * a);

            System.out.println("Roots are Real and Distinct");
            System.out.println("Root 1 = " + r1);
            System.out.println("Root 2 = " + r2);
        } 
        
        else if(d<0){
            r1 = -b / (2 * a);
            r2 = Math.sqrt(-d) /(double) (2 * a);
s
            System.out.println("Roots are Imaginary");
            System.out.println("Root 1 = " + r1 + " + " + r2 + "i");
            System.out.println("Root 2 = " + r1 + " - " + r2 + "i");
        }

        sc.close();
    }
}
 
    

