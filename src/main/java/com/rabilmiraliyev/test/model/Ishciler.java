package com.rabilmiraliyev.test.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotEmpty;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.format.annotation.DateTimeFormat;

import com.rabilmiraliyev.test.model.City;

@XmlRootElement
@Entity
public class Ishciler {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotEmpty
	private String ad;
	@NotEmpty
	private String soyad;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dogumTarixi;
	@NotEmpty
	private String bolme1;
	@NotEmpty
	private String unvan;
	
	private float maas;
	// City clasindan olan city obyektini yaradib onu one to one edirem
	@OneToOne
	private City city;
	
	
	public City getCity() {
		return city;
	}



	public void setCity(City city) {
		this.city = city;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getAd() {
		return ad;
	}



	public void setAd(String ad) {
		this.ad = ad;
	}



	public String getSoyad() {
		return soyad;
	}



	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}



	public Date getDogumTarixi() {
		return dogumTarixi;
	}



	public void setDogumTarixi(Date dogumTarixi) {
		this.dogumTarixi = dogumTarixi;
	}



	public String getBolme1() {
		return bolme1;
	}



	public void setBolme1(String bolme1) {
		this.bolme1 = bolme1;
	}



	public String getUnvan() {
		return unvan;
	}



	public void setUnvan(String unvan) {
		this.unvan = unvan;
	}



	public float getMaas() {
		return maas;
	}



	public void setMaas(float maas) {
		this.maas = maas;
	}



	@Override
	public String toString() {
		return "Ishciler [id=" + id + ", ad=" + ad + ", soyad=" + soyad + ", dogumTarixi=" + dogumTarixi + ", bolme1="
			+bolme1	+ ", unvan=" + unvan + ", maas=" + maas + ", city=" + city + "]";
	}

}
