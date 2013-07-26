package com.ipi.zk.pertama.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/** @author Saifi Ahmada Jul 13, 2013 2:34:21 PM  **/
@Entity
@Table(name="PEMBELIAN")
public class Pembelian implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id @Column(name="PEMBELIAN_ID")
	private String pembelianId;
	@Column(name="TGL")
	@Temporal(TemporalType.DATE)
	private Date tgl;
	@OneToMany(mappedBy="pembelian", cascade=CascadeType.ALL)
	private Set<PembelianDtl> pembelianDtls;
	
	public Pembelian() {
	
	}
	
	public Pembelian(String pembelianId){
		this.pembelianId = pembelianId;
	}
	
	public Set<PembelianDtl> getPembelianDtls() {
		return pembelianDtls;
	}

	public void setPembelianDtls(Set<PembelianDtl> pembelianDtls) {
		this.pembelianDtls = pembelianDtls;
	}

	public String getPembelianId() {
		return pembelianId;
	}

	public void setPembelianId(String pembelianId) {
		this.pembelianId = pembelianId;
	}

	public Date getTgl() {
		return tgl;
	}

	public void setTgl(Date tgl) {
		this.tgl = tgl;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		Pembelian other = (Pembelian) obj;
		if (pembelianId == null) {
			if (other.pembelianId != null)
				return false;
		} else if (!pembelianId.equals(other.pembelianId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pembelian [pembelianId=" + pembelianId + "]";
	}

}

