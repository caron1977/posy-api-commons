package de.fhws.posy.commons.enums;

public class ExamGradeTypes {

	public static final String AVERAGE = "DN";

	public static final String NOGRADE = "ON";

	public static final String INTEGERGRADE = "GN";

	private String code;

	private ExamGradeTypes(String code) {
		this.code = code;
	}

	public String getCode() {

		return code;
	}

}
