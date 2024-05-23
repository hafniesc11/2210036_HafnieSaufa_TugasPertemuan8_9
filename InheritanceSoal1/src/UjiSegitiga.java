/*
Hafnie Saufa Chandrika
2210036
Pendidikan Ilmu Komputer 4B
 */

import java.util.Scanner;

public class UjiSegitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sisi 1: ");
        double side1 = input.nextDouble();
        System.out.print("Masukkan sisi 2: ");
        double side2 = input.nextDouble();
        System.out.print("Masukkan sisi 3: ");
        double side3 = input.nextDouble();

        System.out.print("Masukkan warna: ");
        String warna = input.next();

        System.out.print("Apakah segitiga terisi (true/false)? ");
        boolean terisi = input.nextBoolean();

        Segitiga segitiga = new Segitiga(side1, side2, side3);
        segitiga.setWarna(warna);
        segitiga.setTerisi(terisi);

        System.out.println(" ");
        System.out.println("Luas: " + segitiga.getArea());
        System.out.println("Keliling: " + segitiga.getPerimeter());
        System.out.println("Warna: " + segitiga.getWarna());
        System.out.println("Terisi: " + segitiga.isTerisi());
        System.out.println(segitiga);
    }
}