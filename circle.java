//daire alan:πrr,daire çevre:2πr
import java.util.Scanner;
public class circle {
    public static void main(String[] args) {
   
        int r;
        double pi= 3.14; 

        Scanner inp = new Scanner(System.in);

        System.out.println(" enter the radius of the circle :");
        
        r = inp.nextInt(); 
        double area = pi * r * r;
        double perimt = 2 * pi * r;

        System.out.println("Area of the Circle :" + area);
        System.out.println("Circumference of the Circle :" + perimt);
        
    }

    
}
