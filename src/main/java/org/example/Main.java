package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Matematik sınav puanınızı girin: ");
        int math = scanner.nextInt();

        System.out.print("Fizik sınav puanınızı girin: ");
        int physics = scanner.nextInt();

        System.out.print("Kimya sınav puanınızı girin: ");
        int chem = scanner.nextInt();

        System.out.print("Türkçe sınav puanınızı girin: ");
        int turkish = scanner.nextInt();

        System.out.print("Tarih sınav puanınızı girin: ");
        int history = scanner.nextInt();

        System.out.print("Müzik sınav puanınızı girin: ");
        int music = scanner.nextInt();



        int toplam = math + physics + chem + turkish + history + music;
        double ortalama = (double) toplam / 6;

        System.out.println("Ortalamanız: " + ortalama);

        String sinifDurumu = (ortalama > 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(sinifDurumu);
    }
}