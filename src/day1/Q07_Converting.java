package day1;

import java.util.Scanner;

public class Q07_Converting {
   public static void main(String[] args) {


    /*
        galonu litreye ceviren bir java programi yaziniz
            1 gallon = 3.785 litre
        litreyi galona ceviren bir java programi yaziniz
            1 litre = 1/3.785 gallon

        */
      double gallon;
      double lit;




      Scanner scan = new Scanner(System.in);

     /* System.out.println("Lütfen gallon miktarını giriniz");
      gallon=scan.nextDouble();
      lit=gallon*(3.785);
      System.out.println(  lit+" litre dir");

      System.out.println("Lütfen litre miktarını giriniz");
      lit=scan.nextDouble();
      gallon=lit*(1/(3.785));
      System.out.println(  gallon+" gallon dur");*/

      // Sıcaklığı Fahrenhayt'tan Santigrat derecesine çeviren bir Java programı yazın.
      // formül
      // c = (f-32)*5/9
      System.out.print("Lütfen Fahrenhayt değeri giriniz: ");
      double f=scan.nextDouble();
      double  c = (f-32)*5/9;
      System.out.println("Santigrat = " + c);


   }

}
