package com.fatma.oop.HashMap;

import java.util.HashMap;
import java.util.Map;

public class OgrenciNot {
    public static void main(String[] args){

        //hashmap oluştur
        HashMap<String, Integer> notlar = new HashMap<>();

        //anahtar değer çiftlerini ekle
        notlar.put("Ahmet", 90);
        notlar.put("Ayşe", 85);
        notlar.put("Mehmet", 75);

        //for-each ile tüm öğrenci ve notlarını yaz
        for (Map.Entry<String, Integer> entry: notlar.entrySet()){
            String ogrenci = entry.getKey();
            Integer notu = entry.getValue();
            System.out.println(ogrenci + " " + notu);
        }
    }
}
