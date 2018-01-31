package de.fhws.posy.commons.enums;

public enum ModuleTypeEnum {

	//@formatter:off
	E("Element"), 
	T("Teilprüfung"), 
	K("Konto");
	//@formatter:on

	private String name;

	private ModuleTypeEnum(String name) {

		this.name = name;
	}

	public String getName() {

		return name;
	}

}
