package com.bala.HibernateExample;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Employ {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name = "FIRST_NAME")
	private String firstName;

	@AttributeOverrides({ 
			@AttributeOverride(name = "city", column = @Column(name = "OFFICE_CITY_NAME")),
			@AttributeOverride(name = "state", column = @Column(name = "OFFICE_STATE_NAME"))
	})
	private Address officeAddress;
	
	private Address homeAddress;

	@Transient
	private String lastName;
	
	//private Date joinigDate;

	public Address getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Employ [id=" + id + ", firstName=" + firstName + ", officeAddress=" + officeAddress + ", homeAddress="
				+ homeAddress + ", lastName=" + lastName + "]";
	}
	
	/*public Date getJoinigDate() {
		return joinigDate;
	}

	public void setJoinigDate(Date joinigDate) {
		this.joinigDate = joinigDate;
	}
*/
}
