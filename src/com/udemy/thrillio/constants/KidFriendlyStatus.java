package com.udemy.thrillio.constants;

public enum KidFriendlyStatus {
	APPROVED("approved"), REJECTED("rejected"), UNKNOWN("unknown");

	private String string;

	private KidFriendlyStatus(String string) {
		this.string = string;
	}

	public String getString() {
		return string;
	}
}
