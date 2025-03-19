package com.management.attendance;

public class Attendance {
	private String date;
	private String presence;

	public Attendance() {
	}

	public Attendance(String date, String presence) {
		this.date = date;
		this.presence = presence;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getPresence() {
		return presence;
	}

	public void setPresence(String presence) {
		this.presence = presence;
	}

}
