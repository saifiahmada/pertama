package com.ipi.zk.pertama.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/** @author Saifi Ahmada Jul 13, 2013 2:47:56 PM  **/
@Entity
@Table(name="BARANG")
public class Barang implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id @Column(name="BARANG_ID")
	private String barangId;
	@Column(name="NAMA")
	private String nama;
	@Column(name="HARGA")
	private Integer harga;
	
	public Barang() {
	}
	
	public Barang(String barangId) {
		this.barangId = barangId;
	}

	public String getBarangId() {
		return barangId;
	}

	public void setBarangId(String barangId) {
		this.barangId = barangId;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public Integer getHarga() {
		return harga;
	}

	public void setHarga(Integer harga) {
		this.harga = harga;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((barangId == null) ? 0 : barangId.hashCode());
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
		Barang other = (Barang) obj;
		if (barangId == null) {
			if (other.barangId != null)
				return false;
		} else if (!barangId.equals(other.barangId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Barang [barangId=" + barangId + "]";
	}

}

