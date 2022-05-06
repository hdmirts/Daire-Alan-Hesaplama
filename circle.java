import java.util.Scanner;
public class circle {
    public static void main(String[] args) {
   
        int r;
        double pi= 3.14;
        double a; 

        Scanner inp = new Scanner(System.in);
        
        System.out.println("radius of the circle :");
        r = inp.nextInt();

        System.out.println("corner of the circle slice :");
        a = inp.nextInt();
        //daire alan:πrr,daire çevre:2πr,daire dilimi alanı: (𝜋 * (r*r) * 𝛼) / 360
        double area = pi * r * r;
        double perimt = 2 * pi * r;
        double segmentArea = (pi * (r * r) * a) / 360;

        System.out.println("Area of the Circle :" + area);
        System.out.println("Circumference of the Circle :" + perimt);
        System.out.println("Circle Slice Area :" + segmentArea);


    }

    
}
