import java.util.*;
import java.lang.Math;

public class T00 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int a, b, tambah, kali;

        a = Integer.parseInt(input.nextLine());
        b = Integer.parseInt(input.nextLine());
        if (a % 2 == 0) {
            System.out.println("a adalah genap");
        } else {
            System.out.println("a adalah ganjil");
        }
        if (b % 2 == 0) {
            System.out.println("b adalah genap");
        } else {
            System.out.println("b adalah ganjil");
        }
        if (a == b) {
            System.out.println("sama besar");
        } else {
            if (a > b) {
                System.out.println("a lebih besar");
            } else {
                if (b > a) {
                    System.out.println("b lebih besar");
                } else {
                    System.out.println("keduanya sama besar");
                }
            }
        }
        if (a % 2 == 0) {
            if (b % 2 == 0) {
                tambah = a + b;
                System.out.println(tambah);
            } else {
                System.out.println("berbeda jenis");
            }
        } else {
            if (b % 2 != 0) {
                kali = a * b;
                System.out.println(kali);
            } else {
                System.out.println("berbeda jenis");
            }
        }
    }
}
