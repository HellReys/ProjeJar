package com.berk.toplama;

import java.util.Scanner;


public class islem {
    public islem() throws InterruptedException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen toplamak istediğiniz sayıyı giriniz: ");
        System.out.println("Birinci sayı: ");
        int a = scanner.nextInt();
        System.out.println("İkinci sayı: ");
        int b = scanner.nextInt();
        int sonuc = a+b;
        System.out.println("Sonuç Hesaplanıyor...");
        Thread.sleep(3000);
        System.out.println("İşlem Sonucu="+sonuc);
    }
    
}
