package baitap;

public class Bai3 {
    public static void main(String[] args) {
        System.out.println("Hien thi cac so nguyen to nho hon 100: ");
        for (int i = 2; i <= 100; i++) {
            boolean check = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.printf("%d\t", i);
            }
        }
    }
}
