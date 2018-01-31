package de.fhws.posy.commons.enums;

public enum WorkflowStatus {

	//@formatter:off
	TEMPLATE("Entwurf"),
	SIGNGRADES("Mitzeichnen"),
	RELEASED("Freigegeben"), 
	APPROVED("Genehmigt"), 
	REJECTED("Abgelehnt"),
	WITHDRAWN("Zurückgezogen"),
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
