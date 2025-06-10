package com.fatma.oop.LambdaExpressions;

import java.util.ArrayList;

public class LambdaOrnek {
    public static void main(String[] args){

        //Liste oluştur
        ArrayList<Integer> sayilar = new ArrayList<>();

        //Sayıları ekle
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);
        sayilar.add(50);

        //Lambda ile tüm sayıları yazdır
        sayilar.forEach(sayi -> System.out.println(sayi));
    }
}
