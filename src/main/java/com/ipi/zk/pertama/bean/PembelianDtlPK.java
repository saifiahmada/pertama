package com.ipi.zk.pertama.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/** @author Saifi Ahmada Jul 13, 2013 2:43:28 PM  **/
@Embeddable
public class PembelianDtlPK implements Serializable {

	private static final long serialVersionUID = 1L;
	@Column(name="PEMBELIAN_ID")
	private String pembelianId;
	@Column(name="BARANG_ID")
	private String barangId;
	
	public PembelianDtlPK() {
	}
	
	public PembelianDtlPK(String pembelianId, String barangId) {
		this.pembelianId = pembelianId;
		this.barangId = barangId;
	}

	public String getPembelianId() {
		return pembelianId;
	}

	public void setPembelianId(String pembelianId) {
		this.pembelianId = pembelianId;
	}

	public String getBarangId() {
		return barangId;
	}

	public void setBarangId(String barangId) {
		this.barangId = barangId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((barangId == null) ? 0 : barangId.hashCode());
		result = prime * result
				+ ((pembelianId == null) ? 0 : pembelianId.hashCode());
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
		PembelianDtlPK other = (PembelianDtlPK) obj;
		if (barangId == null) {
			if (other.barangId != null)
				return false;
		} else if (!barangId.equals(other.barangId))
			return false;
		if (pembelianId == null) {
			if (other.pembelianId != null)
				return false;
		} else if (!pembelianId.equals(other.pembelianId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PembelianDtlPK [pembelianId=" + pembelianId + ", barangId="
				+ barangId + "]";
	}
	

}

