 import java.util.Scanner;
class InputScanner{
    Scanner scanner=new Scanner(System.in);
}
abstract class Shape extends InputScanner{
    int dimension1;
    int dimension2;
    abstract void printArea();


}
class Rectangle extends Shape{
    voi input(){
        System.out.println("Enter the dimensions of rectangle(length and bredth):");
        dimension1=scanner.nextInt();
        dimension2=scanner.nextInt();

    }
    void printArea(){
        
        double area=dimension1*dimension2;
        System.out.println("ARea of rectanglr:"+area);

    }

}
class Triangle extends Shape{
    void input(){
        System.out.println("Enter the dimensions of rectangle(base and height):");
        dimension1=scanner.nextInt();
        dimension2=scanner.nextInt();

    }

    void printArea(){
        
        double area=0.5*dimension1*dimension2;
        System.out.println("ARea of triangle:"+area);

    }

}
class Circle extends Shape{
    void input(){
        System.out.println("Enter the dimensions of rectangle(radius):");
        dimension1=scanner.nextInt();

    }
     void printArea(){
        
        double area=Math.PI*dimension1*dimension1;
        System.out.println("ARea of circle:"+area);

    }

}
public class Abstractclass{
    public static void main(String[] args) {
        Shape rectangle=new Rectangle();
        Shape triangle=new Triangle();
        Shape circle=new Circle();
        rectangle.input();
        triangle.input();
        circle.input();
        
        

        rectangle.printArea();
        triangle.printArea();
        circle.printArea();
        
        


        

        
    }

}



