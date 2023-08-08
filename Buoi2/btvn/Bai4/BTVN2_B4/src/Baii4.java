
import java.util.Scanner;

public class Baii4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        float a = sc.nextFloat();
        System.out.println("Nhap b: ");
        float b = sc.nextFloat();
        System.out.println("Nhap c: ");
        float c = sc.nextFloat();
        float delta = b * b - 4 * a * c;
        double t1 = (-b + Math.sqrt(delta))/(2*a);
        double t2 = (-b - Math.sqrt(delta))/(2*a);
        
        System.out.println("--------------------------");
        if (delta < 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else if (delta == 0) {
            if (t1 >= 0 ) {
                System.out.println("Phuong trinh co nghiem: ");
                System.out.println("x1= " + Math.sqrt(t1));
                System.out.println("x2= " + (-Math.sqrt(t1)));
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            if(t1 >= 0){
                if(t2<0){
                    System.out.println("x1= " + Math.sqrt(t1));
                    System.out.println("x2= " + (- Math.sqrt(t1)));
                }else{
                    System.out.println("x1= " + Math.sqrt(t1));
                    System.out.println("x2= " + (- Math.sqrt(t1)));
                    System.out.println("x3= " + Math.sqrt(t2));
                    System.out.println("x4= " + (- Math.sqrt(t2)));
                }
            }else{
                if(t2<0){
                    System.out.println("Phuong trinh vo nghiem");
                }else{
                    System.out.println("x1= " + Math.sqrt(t2));
                    System.out.println("x2= " + (- Math.sqrt(t2)));
                }
            }
        }

    }

}
