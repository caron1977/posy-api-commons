package de.fhws.posy.commons.enums;

import javax.xml.bind.annotation.XmlEnumValue;

public enum WorkflowStatus {

	//@formatter:off
	@XmlEnumValue(value="Entwurf")
	TEMPLATE("Entwurf"),
	@XmlEnumValue(value="Mitzeichnen")
	SIGNGRADES("Mitzeichnen"),
	@XmlEnumValue(value="Freigegeben")
	RELEASED("Freigegeben"), 
	@XmlEnumValue(value="Genehmigt")
	APPROVED("Genehmigt"), 
	@XmlEnumValue(value="Abgelehnt")
	REJECTED("Abgelehnt"),
	@XmlEnumValue(value="Zurückgezogen")
	WITHDRAWN("Zurückgezogen"),
	@XmlEnumValue(value="Abgesagt")
	CANCELED("Abgesagt");
	//@formatter:on

	private String display;

	WorkflowStatus(String display) {

		this.display = display;
	}

	public String getDisplay() {

		return display;
	}

}
