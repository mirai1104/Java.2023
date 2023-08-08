
import java.util.Scanner;

public class Baii2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//phan a:
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        float s = 1;
        for (int i = 2; i <= n; i++) {
            s += 1.0 / i;
          
        }

//phan b:
        int p = 0;
        int t = 1;
        for (int i = 1; i <= n; i++) {
            t *= i; 
            p += t;
        }
        System.out.println("--------------");
        System.out.println("a) Tong S la: " + s);
        System.out.println("b) Tong P la: " + p);
    }
}
