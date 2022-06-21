package day1;

import java.util.Scanner;

public class Q09_Scanner02 {
    // kullaniciya ad, memleket,su anki konum, yas, boy soran bir program olusturun,
    // ve yasadiklari yeri seviyorlarsa
    // bu bilgiyi yazdirin

    // next() only can read the first word
    // nextLine() can read the whole line
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen adınızı,memleket,su anki konum, yas, boyunuzu(cm) giriniz ve aralarda \'Enter\' 'a basınız");
        String ad=scan.nextLine();
        String memleket=scan.nextLine();
        String konum=scan.nextLine();
        int yas=scan.nextInt();
        double boy=scan.nextDouble();
        System.out.println("Yaşadığınız yeri seviyorsanız \'Y\' ,sevmiyorsanız \'N\' tuşuna basınız");
        String yer=scan.next();
        if(yer.equals("Y")){
            System.out.println("ad = " + ad+" memleket= "+memleket+" konum= "+konum+" yaş= "+yas+" boy= "+boy);
        }

        }


    }





