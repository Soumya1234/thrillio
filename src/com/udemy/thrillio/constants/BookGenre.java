package com.udemy.thrillio.constants;

public enum BookGenre {
	ART("art"), BIOGRAPHY("biography"), CHILDREN("children"), FICTION("fiction"), HISTORY("history"),
	MYSTERY("mystery"), PHILOSOPHY("philosophy"), RELIGION("religion"), ROMANCE("romance"), SELF_HELP("self_help"),
	TECHNICAL("technical");
	private String name;
	private BookGenre(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	

}
