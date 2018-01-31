package de.fhws.posy.commons.enums;

public enum ChapterEnum {

	GS("Grundstudium"), PS("Praxissemester"), HS("Hauptstudium");

	private String name;

	ChapterEnum(String name) {

		this.name = name;
	}

	public String getName() {

		return name;
	}

}
