package de.fhws.posy.commons.enums;

public enum SubjectTypeEnum {

	//@formatter:off
	P("Pflichtfach"), 
	F("Fachbezogenes Wahlpflichtfach"), 
	A("Allgemeinwissenschaftliches Wahlpflichtfach"), 
	S("Schwerpunktbezogenes Wahlpflichtfach"),
	K("Katalog");
	//@formatter:on

	private String name;

	private SubjectTypeEnum(String name) {

		this.name = name;
	}

	public String getName() {

		return name;
	}

}
