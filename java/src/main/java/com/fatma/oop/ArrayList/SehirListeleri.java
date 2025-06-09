package com.fatma.oop.ArrayList;

import java.util.ArrayList;

public class SehirListeleri {

    public static void main(String[] args) {
        // 1.Liste oluşur
        // ArrayList<String>: Bu, içinde sadece String (yazı) türünde verileri saklar

        ArrayList<String> sehirler= new ArrayList<>();

        // 2.Şehir isimlerini ekle.
        // .add : Listeye bir eleman eklemek için kullanılır

        sehirler.add("Kütahya");
        sehirler.add("Bilecik");
        sehirler.add("İzmir");

        //3. For-each ile yazdır
        // for (String sehir:sehirler) : Listedeki her elemanı teker teker gezmek için kullanılır
        //bu yapıya for-each döngüsü denir.

        for (String sehir : sehirler) {
            System.out.println(sehir);
        }

    }
}
