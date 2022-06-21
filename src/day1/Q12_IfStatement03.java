package day1;


import java.util.Scanner;

public class Q12_IfStatement03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        Print "Lutfen is unvaninizi girin
        jobTitle isimli bir degisken olusturun ve kullanicidan isteyin.
        Dogru jobTitle yazdirmak icin asagidaki test datalarini kullanin. Example :
        Eger jobTitle  qa ise print is unvaniniz Quality Analyst
        test data: qa ise print Quality Analyst
        dev ise print Developer
        ba ise print Business Analyst
        pm ise print Project Manager
       */
        System.out.println("Lutfen is unvaninizi giriniz\n(qa,dev,ba,pm) ");
        String jobTitle=scan.nextLine().toLowerCase();
        if(jobTitle.equals("qa")){
            System.out.println("is unvaniniz Quality Analyst");
        }
        if(jobTitle.equals("dev")){
            System.out.println("is unvaniniz Developer");
        }
        if(jobTitle.equals("ba")){
            System.out.println("is unvaniniz Business Analyst");
        }
        if(jobTitle.equals("pm")){
            System.out.println("is unvaniniz Project Manager");
        }

    }


}

