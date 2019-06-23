package com.udemy.thrillio.constants;

public enum UserType {

	USER("user"), EDITOR("editor"), CHIEF_EDITOR("chiefeditor");

	private String string;

	private UserType(String string) {
		this.string = string;
	}

	public String getString() {
		return string;
	}

}
