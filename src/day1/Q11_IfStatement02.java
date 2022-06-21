package day1;

import java.util.Scanner;

public class Q11_IfStatement02 {
    public static void main(String[] args) {
        /*
    not hesaplayici
		   	A => 90 ~100
		   	B => 80 ~ 89
		   	C => 70 ~ 79
		   	D => 60 ~ 69
		   	F =>  0 ~ 59
     */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz");
        int note = scan.nextInt();
        if (note >= 90 && note <= 100) {
            System.out.println("A");

        }
        if (note >= 80 && note <= 89) {
            System.out.println("B");

        }
        if (note >= 70 && note <= 79) {
            System.out.println("C");

        }
        if (note >= 60 && note <= 69) {
            System.out.println("D");

        }
        if (note >= 0 && note <= 59) {
            System.out.println("F");

        }
    }


}
