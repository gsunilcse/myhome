package com.myhome.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "MEMBER")
public class MemberEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "mid")
	private Integer mId;
	private String firstName;
	private String middleName;
	private String lastName;
	private String gender;
	private String dob;

	/*
	 * private String maritalStatus; private String spouseMId; private String
	 * qualification; private String employmentStatus;
	 */
	public Integer getmId() {
		return mId;
	}
	public void setmId(Integer mId) {
		this.mId = mId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	/*
	 * public String getMaritalStatus() { return maritalStatus; } public void
	 * setMaritalStatus(String maritalStatus) { this.maritalStatus = maritalStatus;
	 * } public String getSpouseMId() { return spouseMId; } public void
	 * setSpouseMId(String spouseMId) { this.spouseMId = spouseMId; } public String
	 * getQualification() { return qualification; } public void
	 * setQualification(String qualification) { this.qualification = qualification;
	 * } public String getEmploymentStatus() { return employmentStatus; } public
	 * void setEmploymentStatus(String employmentStatus) { this.employmentStatus =
	 * employmentStatus; }
	 */
	@Override
	public String toString() {
		return "MemberEntity [mId=" + mId + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName="
				+ lastName + ", gender=" + gender + ", dob=" + dob + "]";
	}
	
	
	
	

}
