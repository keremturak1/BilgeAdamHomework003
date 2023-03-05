package com.keremturak;

import java.util.ArrayList;
import java.util.Scanner;

public class Televizyon implements ITelevizyon {
	private String marka;
	private String boyut;
	private int ses = 0;
	private boolean tvDurum;
	private ArrayList<Kanal> kanllar = new ArrayList<Kanal>();
	private int kanalYeri = 0;
	private boolean isTv = false;

	public Televizyon() {

		kanallariOlustur();

	}

	public boolean getTv() {
		return isTv;
	}

	public void setTv(boolean isTv) {
		this.isTv = isTv;
	}

	public int getKanalYeri() {
		return kanalYeri;
	}

	public void setKanalYeri(int kanalYeri) {
		this.kanalYeri = kanalYeri;
	}

	public boolean getTvDurum() {
		return tvDurum;
	}

	public void setTvDurum(boolean tvDurum) {
		this.tvDurum = tvDurum;
	}

	public int getSes() {
		return ses;
	}

	public void setSes(int ses) {
		this.ses = ses;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getBoyut() {
		return boyut;
	}

	public void setBoyut(String boyut) {
		this.boyut = boyut;
	}

	public ArrayList<Kanal> getKanllar() {
		return kanllar;
	}

	public void setKanllar(ArrayList<Kanal> kanllar) {
		this.kanllar = kanllar;
	}

	@Override
	public void kanallariOlustur() {
		Kanal kanal1 = new Kanal();
		kanal1.setKanalAdi("TRT3");
		kanal1.setKanalNo(1);
		kanllar.add(kanal1);
		Kanal kanal2 = new Kanal();
		kanal2.setKanalAdi("TRT3");
		kanal2.setKanalNo(2);
		kanllar.add(kanal2);
		Kanal kanal3 = new Kanal();
		kanal3.setKanalAdi("TRT3");
		kanal3.setKanalNo(3);
		kanllar.add(kanal3);
		Kanal kanal4 = new Kanal();
		kanal4.setKanalAdi("TRT3");
		kanal4.setKanalNo(4);
		kanllar.add(kanal4);

	}

	@Override
	public void televizyonuAc() {
		if (getTvDurum() == false) {
			setTvDurum(true);
			System.out.println("Tv açılıyor");
			try {
				setKanalYeri(0);
				System.out.println("İzlenen Kanal" + kanllar.get(getKanalYeri()).getKanalAdi()
						+ kanllar.get(getKanalYeri()).getKanalNo());
			} catch (Exception e) {
				System.out.println("bir hata oluştu");
			}
		} else {
			System.out.println("tv zaten açık");

		}

	}

	@Override
	public void televizyonuKapat() {
		if (getTvDurum() == true) {
			setTvDurum(false);
			System.out.println("Tv kapanıyor..");
		} else {
			System.out.println("tv zaten kapalı");
		}

	}

	@Override
	public void sesAc() {
		if (getSes() < 20) {
			setSes(getSes() + 1);
			System.out.println(getSes());
		} else {
			System.out.println("ses maksimumda");
		}

	}

	@Override
	public void SesKis() {
		if (getSes() > 0) {
			setSes(getSes() - 1);
			System.out.println(getSes());
		} else {
			System.out.println("ses minumum seviyoede");
		}

	}

	@Override
	public void kanalDegistir() {
		try {
			if (kanalYeri == kanllar.size() - 1) {
				setKanalYeri(0);
				System.out.println("İzlenen Kanal" + kanllar.get(getKanalYeri()).getKanalAdi()
						+ kanllar.get(getKanalYeri()).getKanalNo());
			} else {

				setKanalYeri(getKanalYeri() + 1);
				System.out.println("İzlenen Kanal" + kanllar.get(getKanalYeri()).getKanalAdi()
						+ kanllar.get(getKanalYeri()).getKanalNo());

			}

		} catch (IndexOutOfBoundsException e) {
			System.out.println("bir hata oldu");
		}

	}

	@Override
	public void meuyuGöster() {
		// TODO Auto-generated method stub

	}

	@Override
	public void kanalBilgisiniGöster() {
		System.out.println(
				"İzlenen Kanal" + kanllar.get(getKanalYeri()).getKanalAdi() + kanllar.get(getKanalYeri()).getKanalNo());

	}

}
