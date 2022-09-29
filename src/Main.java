import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double length;
        double width;
        double diagonal;
        double area;
        double perimeter;

        System.out.println("Please enter the length and the width of the rectangle: ");

        if(in.hasNextDouble())
        {
            length = in.nextDouble();
            width = in.nextDouble();
            in.nextLine();

            perimeter = (length + width)*2;
            area = length * width;
            diagonal = Math.sqrt(length*length + width*width);

            System.out.println("The area is: " + area);
            System.out.println("The perimeter is: " + perimeter);
            System.out.println("The diagonal is: " + diagonal);
        }
        else
        {
            System.out.println("Enter a valid input");
        }
    }
}