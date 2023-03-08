package rc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào số a :");
        a = input.nextInt();
        System.out.println("Nhập vào số b :");
        b = input.nextInt();
        a = Math.abs(a); // sử dụng hàm abs để trả về giá trị số dương
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("Không có ước chung lớn nhất");
        }
        while (a != b) {
            if (a > b) {
                a = a - b;
                System.out.println("a = " + a);
            } else {
                b = b - a;
                System.out.println("b = " + b);
            }
        }
        System.out.println("Ước chung lớn nhất là : " + a);
    }
}
