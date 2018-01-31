package de.fhws.posy.commons.enums;

public enum ExamTypeEnum {
	
	ÜB("Übung"), PR("Prüfung"), LN("Leistungsnachweis");

	private String name;

	ExamTypeEnum(String name) {

		this.name = name;
	}

	public String getName() {

		return name;
	}
}
