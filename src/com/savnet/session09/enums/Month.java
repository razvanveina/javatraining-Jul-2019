package com.savnet.session09.enums;

public enum Month {
	IAN(31, "Ianuarie"), FEB(28, "Februarie"), MAR(31, "Martie"), APR(30, "Aprilie");

	private int days;
	private String fullName;

	private Month(int days, String fullName) {
		this.days = days;
		this.setFullName(fullName);
	}

	public int getDays() {
		return this.days;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
}
