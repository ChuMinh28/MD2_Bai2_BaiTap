package baitap;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number:");
        int num = Integer.parseInt(scanner.nextLine());
        System.out.printf("Cac so nguyen to tu o den %d la: ",num);
        if (num>=2){
            for (int i = 2; i <= num ; i++) {
                boolean check = false;
                for (int j = 2; j <= Math.sqrt(i) ; j++) {
                    if (i%j==0){
                        check = true;
                        break;
                    }
                }
                if (!check){
                    System.out.printf("%d\t",i);
                }
            }
        }
        else {
            System.out.printf("%d khong phai la so nguyen to",num);
        }
    }
}
