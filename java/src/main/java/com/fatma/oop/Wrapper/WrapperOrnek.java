package com.fatma.oop.Wrapper;

public class WrapperOrnek {
    public static void main(String[] args){
        //Bir int değişkeni tanımla
        int sayi = 43;

        //Autoboxing: int> Integer (nesneye dönüştür)
        Integer nesneSayi= sayi;

        //Unboxing: Integer> int (tekrar ilkel tipe çevirme)
        int tekrarint = nesneSayi;

        //Sonuçları yazdır
        System.out.println("İlk int sayı:" + sayi);
        System.out.println("Integer nesne:" + nesneSayi);
        System.out.println("Tekrar int'e dönüştü:" + tekrarint);
    }
}
