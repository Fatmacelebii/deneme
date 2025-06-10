package com.fatma.oop.Try_catch;

import java.util.Scanner;

public class BolmeOrnek {
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in); //kullanıcıdan veri almak için

        try {
            //kullanıcıdan ilk sayıyı al
            System.out.println("Birinci sayıyı giriniz:");
            int sayi1 = scanner.nextInt();

            //2. sayı için
            System.out.println("İkinci sayıyı giriniz:");
            int sayi2 = scanner.nextInt();

            //bölme işlemi
            int sonuc = sayi1 / sayi2;

            System.out.println("Sonuç:" + sonuc);
        }
        catch (ArithmeticException e) {
            //sıfıra bölme hatası burda yakalanır

            System.out.println("Hata bir sayı sıfıra bölünmez.");
        }
        //scanner kapat
        scanner.close();
        }
    }

