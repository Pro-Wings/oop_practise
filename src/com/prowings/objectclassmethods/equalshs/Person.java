package com.prowings.objectclassmethods.equalshs;

import java.util.Objects;

public class Person {
	
	private int id;
	private String name;
	private String address;

	public Person() {
	}

	public Person(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	@Override
	public int hashCode() {
//		return Objects.hash(address, id, name);
		int addressHs = this.getAddress().hashCode();
		int nameHs = this.getName().hashCode();
		int res = 1;
		int hsc = 31 * (res+addressHs+nameHs);
		
		return hsc;
	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Person other = (Person) obj;
//		return Objects.equals(address, other.address) && id == other.id && Objects.equals(name, other.name);
//	}


	public boolean equals(Object o)
	{
		boolean result = false;
		Person p2 = (Person) o;
		
		if((this.id == p2.id) && (this.name.equals(p2.name)) && (this.address.equals(p2.address)))
			result = true;
		
		return result;
	}
	

}
