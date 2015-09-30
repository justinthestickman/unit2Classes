import java.util.Scanner;

public class Rectangle
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Length of Rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Width of Rectangle: ");
        double width = scanner.nextDouble();
        double area = length*width;
        double perimeter = (2*length)+(2*width);
        double diagonal = Math.sqrt(Math.pow(length,2)+Math.pow(width,2));
        System.out.println("Area: "+area);
        System.out.println("Perimeter: "+perimeter);
        System.out.println("Length of Diagonal: "+diagonal);
    }
}