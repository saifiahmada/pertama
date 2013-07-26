package com.ipi.zk.pertama.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/** @author Saifi Ahmada Jul 26, 2013 10:48:25 AM  **/
@Entity
@Table(name="SURAH")
public class Surah implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="NO_SURAH", length=3)
	private int noSurah;
	@Column(name="NAMA_SURAH", length=50)
	private String namaSurah;
	@Column(name="JUMLAH_AYAT", length=3)
	private int jumlahAyat;
	@Column(name="TEMPAT_TURUN")
	private String tempatTurun;
	@Column(name="ARTI_SURAH")
	private String artiSurah;
	@Column(name="URUTAN_TURUN")
	private int urutanTurun;
	
	public Surah() {
	}
	
	public Surah(int noSurah) {
		this.noSurah = noSurah;
	}

	public String getTempatTurun() {
		return tempatTurun;
	}

	public void setTempatTurun(String tempatTurun) {
		this.tempatTurun = tempatTurun;
	}

	public String getArtiSurah() {
		return artiSurah;
	}

	public void setArtiSurah(String artiSurah) {
		this.artiSurah = artiSurah;
	}

	public int getUrutanTurun() {
		return urutanTurun;
	}

	public void setUrutanTurun(int urutanTurun) {
		this.urutanTurun = urutanTurun;
	}

	public int getNoSurah() {
		return noSurah;
	}

	public void setNoSurah(int noSurah) {
		this.noSurah = noSurah;
	}

	public String getNamaSurah() {
		return namaSurah;
	}

	public void setNamaSurah(String namaSurah) {
		this.namaSurah = namaSurah;
	}

	public int getJumlahAyat() {
		return jumlahAyat;
	}

	public void setJumlahAyat(int jumlahAyat) {
		this.jumlahAyat = jumlahAyat;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + noSurah;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Surah other = (Surah) obj;
		if (noSurah != other.noSurah)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Surah [noSurah=" + noSurah + "]";
	}

}

