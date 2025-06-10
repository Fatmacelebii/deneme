package com.fatma.oop.HashMap;

import java.security.KeyStore;
import java.util.HashMap;
import java.util.Map;

public class OgrenciNot {
    public static void main (String[] args){

        HashMap<String, Integer> notlar = new HashMap<>();

        //Anahtar değer çiftlerini ekle
        notlar.put("Ahmet", 90);
        notlar.put("Ayşe", 85);
        notlar.put("Mehmet" , 75);

        for (Map.Entry<String, Integer> entry : notlar.entrySet()); {

        System.out.println(Entry.getKey()
    }
}
