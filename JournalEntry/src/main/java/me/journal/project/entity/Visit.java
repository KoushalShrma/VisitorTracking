package me.journal.project.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Visit {

	public Integer getvId() {
		return vId;
	}

	public void setvId(Integer vId) {
		this.vId = vId;
	}

	public String getvName() {
		return vName;
	}

	@Override
	public String toString() {
		return "Visit [vId=" + vId + ", vName=" + vName + ", vReason=" + vReason + ", vEmail=" + vEmail + "]";
	}

	public Visit(Integer vId) {
		super();
		this.vId = vId;
	}

	public Visit() {
		super();
	}

	public void setvName(String vName) {
		this.vName = vName;
	}

	public String getvReason() {
		return vReason;
	}

	public void setvReason(String vReason) {
		this.vReason = vReason;
	}

	public String getvEmail() {
		return vEmail;
	}

	public void setvEmail(String vEmail) {
		this.vEmail = vEmail;
	}

	public Visit(Integer vId, String vName, String vReason, String vEmail) {
		super();
		this.vId = vId;
		this.vName = vName;
		this.vReason = vReason;
		this.vEmail = vEmail;
	}

	@Id
	@Column(name = "Visit_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer vId;

	@Column(name = "Visit_Name")
	private String vName;

	@Column(name = "Visit_Reason")
	private String vReason;

	@Column(name = "Visit_Email")
	private String vEmail;

}
