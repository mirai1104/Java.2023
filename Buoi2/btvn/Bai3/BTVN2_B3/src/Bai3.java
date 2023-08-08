
import java.util.Scanner;

public class Bai3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dem = 0;
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        for(int i =1; i<=n; i++){
            if(n%i == 0){
                dem++;
            }
        }
        
        System.out.println("---------");
        if(dem == 2){
            System.out.println(n + " la so nguyen to");
        } else{
            System.out.println(n +  " khong la so nguyen to");
        }
    }

}
