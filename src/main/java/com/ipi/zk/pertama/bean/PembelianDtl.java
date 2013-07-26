package com.ipi.zk.pertama.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/** @author Saifi Ahmada Jul 13, 2013 2:39:52 PM  **/
@Entity
@Table(name="PEMBELIAN_DTL")
public class PembelianDtl implements Serializable {

	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private PembelianDtlPK pembelianDtlPK;
	@Column(name="QTY")
	private int qty;
	
	@ManyToOne
	@JoinColumn(name="PEMBELIAN_ID", referencedColumnName="PEMBELIAN_ID", insertable=false, updatable=false)
	private Pembelian pembelian;
	
	
	
	public PembelianDtl() {
		this.pembelianDtlPK = new PembelianDtlPK();
	}
	
	public PembelianDtl(PembelianDtlPK pembelianDtlPK) {
		this.pembelianDtlPK = pembelianDtlPK;
	}
	
	public PembelianDtl(String pembelianId, String barangId){
		this.pembelianDtlPK = new PembelianDtlPK(pembelianId, barangId);
	}

	public Pembelian getPembelian() {
		return pembelian;
	}

	public void setPembelian(Pembelian pembelian) {
		this.pembelian = pembelian;
	}

	public PembelianDtlPK getPembelianDtlPK() {
		return pembelianDtlPK;
	}

	public void setPembelianDtlPK(PembelianDtlPK pembelianDtlPK) {
		this.pembelianDtlPK = pembelianDtlPK;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((pembelianDtlPK == null) ? 0 : pembelianDtlPK.hashCode());
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
		PembelianDtl other = (PembelianDtl) obj;
		if (pembelianDtlPK == null) {
			if (other.pembelianDtlPK != null)
				return false;
		} else if (!pembelianDtlPK.equals(other.pembelianDtlPK))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PembelianDtl [pembelianDtlPK=" + pembelianDtlPK + "]";
	}

}

