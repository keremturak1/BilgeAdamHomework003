package com.keremturak;

import java.util.Scanner;

public class Main {
	public static void tvKurveKanallariOlustur(Televizyon televizyon) {

		Scanner input = new Scanner(System.in);
		System.out.println("Televizyonun markası nedir?");
		televizyon.setMarka(input.nextLine());

		System.out.println("Televizyonun boyutu nedir?");
		televizyon.setBoyut(input.nextLine());
		televizyon.setTvDurum(true);
		televizyon.setTv(true);

	}

	public static void main(String[] args) {

		int secim;
		Televizyon televizyon = new Televizyon();
		do {
			System.out.println("0-- Çıkış\n1-- Televizyon Kur\n2-- Televizyonu Aç\n"
					+ "3-- Sesini Artır\n4-- Sesi Azalt\n5-- Kanal Değiştir\n6-- Kanal Bilgisi Goster\n"
					+ "7-- Televizyonu Kapat\n8-- Menüyü Goster");
			Scanner input = new Scanner(System.in);
			secim = input.nextInt();

			switch (secim) {
			case 1:

				tvKurveKanallariOlustur(televizyon);
				televizyon.setTv(true);
				break;
			case 2:
				if (televizyon.getTv() == false) {
					System.out.println("Lütfen önce kurulum gerçekleştiriniz...");
				} else {
					televizyon.televizyonuAc();
					System.out.println(televizyon.getTvDurum());
				}

				break;
			case 3:
				if (televizyon.getTv() == false) {
					System.out.println("Lütfen önce kurulum gerçekleştiriniz...");
				} else {

				}
				televizyon.sesAc();
				break;
			case 4:
				if (televizyon.getTv() == false) {
					System.out.println("Lütfen önce kurulum gerçekleştiriniz...");
				} else {
					televizyon.SesKis();
				}

				break;
			case 5:
				if (televizyon.getTv() == false) {
					System.out.println("Lütfen önce kurulum gerçekleştiriniz...");
				} else {
					televizyon.kanalDegistir();
				}

				break;
			case 6:
				if (televizyon.getTv() == false) {
					System.out.println("Lütfen önce kurulum gerçekleştiriniz...");
				} else {
					televizyon.kanalBilgisiniGöster();
				}

				break;
			case 7:
				if (televizyon.getTv() == false) {
					System.out.println("Lütfen önce kurulum gerçekleştiriniz...");
				} else {
					televizyon.televizyonuKapat();
				}

				break;
			case 8:
				if (televizyon.getTv() == false) {
					System.out.println("Lütfen önce kurulum gerçekleştiriniz...");
				} else {
					televizyon.meuyuGöster();

				}

				break;

			default:
				break;
			}

		} while (secim != 0);

	}

}
