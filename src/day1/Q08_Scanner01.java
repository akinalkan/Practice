package day1;

import java.util.Scanner;

public class Q08_Scanner01 {
    // kullanicidan 2 tam sayi alin
    // bu tam sayilari toplayin ve sonucu yazdirin
    public static void main(String[] args) {
        int sayi1,sayi2;
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen 1. sayıyı giriniz");
        sayi1= scan.nextInt();
        System.out.println("Lütfen 2. sayıyı giriniz");
        sayi2= scan.nextInt();
        System.out.println("sayılar toplamı: "+(sayi1+sayi2));

    }



}
