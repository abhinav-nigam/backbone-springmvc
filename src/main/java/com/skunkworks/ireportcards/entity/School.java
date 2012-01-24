package com.skunkworks.ireportcards.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class School {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	
	@Lob
	private String address;
	
	@ManyToOne
	private Teacher principal;
	
	@Lob
	private String contact;
	
	@OneToMany
	private Set<Level> classes;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Teacher getPrincipal() {
		return principal;
	}

	public void setPrincipal(Teacher principal) {
		this.principal = principal;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public Set<Level> getClasses() {
		return classes;
	}

	public void setClasses(Set<Level> classes) {
		this.classes = classes;
	}

	@Override
	public String toString() {
		return "School [id=" + id + ", name=" + name + ", address=" + address
				+ ", principal=" + principal + ", contact=" + contact
				+ ", classes=" + classes + "]";
	}
	
	
}
