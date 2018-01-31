package de.fhws.posy.commons.enums;

public enum MessageSeverity {

	ERROR("Fehler:"), WARNING("Warnung:");

	private String display;

	private MessageSeverity(String display) {

		this.display = display;
	}

	public String getDisplay() {

		return display;
	}

}
