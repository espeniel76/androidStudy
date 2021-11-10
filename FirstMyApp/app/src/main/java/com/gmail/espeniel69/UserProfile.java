package com.gmail.espeniel69;

public class UserProfile {
	public String name;
	public String phone;
	public String address;

	public UserProfile(String name, String phone, String address) {
		this.name = name;
		this.phone = phone;
		this.address = address;
	}

	@Override
	public String toString() {
		return "UserProfile name=" + name + ", phone=" + phone + ", address=" + address;
	}
}
