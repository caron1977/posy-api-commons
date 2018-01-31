package de.fhws.posy.commons.enums;

public enum ExamPeriodStatusEnum {

	//@formatter:off
	INPREPARATION("enum.applicationperiodstatus.inpreparation"), 
	ACTIVE("enum.applicationperiodstatus.active"), 
	COMPLETED("enum.applicationperiodstatus.completed");
	//@formatter:on

	/**
	 * key in message-bundle
	 */
	private String name;

	ExamPeriodStatusEnum(String name) {

		this.name = name;
	}

	public String getName() {

		return name;
	}
}
