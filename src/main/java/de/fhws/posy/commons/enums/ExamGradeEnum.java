package de.fhws.posy.commons.enums;

public enum ExamGradeEnum {

	// @formatter:off
	DN("Differenzierte Note"), // Differenzierte Note
	GN("Ganze Note"), // Ganze Note
	ON("Ohne Note"); // ohne Note
	// @formatter:on

	private String display;

	private ExamGradeEnum(String display) {
		this.display = display;
	}

	public String getDisplay() {

		return display;
	}

}
