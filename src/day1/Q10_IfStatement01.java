package day1;

import java.util.Scanner;

public class Q10_IfStatement01 {
    public static void main(String[] args) {
        /*
         * KullanicidanY/N ikilisinden birisini girdiginde girdigi degeri
         * ekrana yazdiran java kodunu yaziniz.
         * INPUT : Y ,  N
         * OUTPUT : YES ; NO
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Y/N ikilisinden birisini giriniz");
        String deger=scan.next().toUpperCase();
        if(deger.equals("Y")) {
            System.out.println("girilen değer: YES");
        }
        if(deger.equals("N")) {

            System.out.println("girilen değer: NO");
        }


    }


}
