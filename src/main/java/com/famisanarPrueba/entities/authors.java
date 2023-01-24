package com.famisanarPrueba.entities;


import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "lib_authors")
public class authors {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "authorIdGenerator")
	@SequenceGenerator(name = "authorIdGenerator", initialValue = 1, allocationSize = 1, sequenceName = "author_id_seq")
	private int id;
	
	@NotNull(message = "dont not null")
	@Column(name = "aut_firts_name", length = 30)
	private String autName;
	
	@NotNull(message = "dont not null")
	@Column(name = "aut_last_name", length = 30)
	private String autLastName;
	
	@Column(name = "aut_date_dob")
	private Date autDateDob;
	
	@NotNull(message = "dont not null")
	@Column(name = "aut_gender", length = 1)
	private String autGender;
	
	@Column(name = "aut_contact", length = 30)
	private String autContact;
	
	@Column(name = "aut_other_detals", length = 200)
	private String autOtherDetals;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAutName() {
		return autName;
	}

	public void setAutName(String autName) {
		this.autName = autName;
	}

	public String getAutLastName() {
		return autLastName;
	}

	public void setAutLastName(String autLastName) {
		this.autLastName = autLastName;
	}

	public Date getAutDateDob() {
		return autDateDob;
	}

	public void setAutDateDob(Date autDateDob) {
		this.autDateDob = autDateDob;
	}

	public String getAutGender() {
		return autGender;
	}

	public void setAutGender(String autGender) {
		this.autGender = autGender;
	}

	public String getAutContact() {
		return autContact;
	}

	public void setAutContact(String autContact) {
		this.autContact = autContact;
	}

	public String getAutOtherDetals() {
		return autOtherDetals;
	}

	public void setAutOtherDetals(String autOtherDetals) {
		this.autOtherDetals = autOtherDetals;
	}
	
	
	
}
