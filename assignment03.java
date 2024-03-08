import java.util.Scanner;

public class assignment03 {
    public static void main(String[] args) {
        //getting input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the radius of the circle in cm: ");
        double radius = scanner.nextDouble();
        
        scanner.close(); //closing the reader
        
        double area = Math.PI * radius * radius;


        System.out.println("Area of the circle: " + area + "cm^2");
    }
}
