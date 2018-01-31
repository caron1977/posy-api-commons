package de.fhws.posy.commons.enums;

import javax.xml.bind.annotation.XmlType;

@XmlType(namespace = "de.fhws.exam.enums")
public enum SemesterEnum {

	SS("Sommersemester"), WS("Wintersemester");

	/**
	 * key in message-bundle
	 */
	private String name;

	SemesterEnum(String name) {

		this.name = name;
	}

	public String getName() {

		return name;
	}

}
