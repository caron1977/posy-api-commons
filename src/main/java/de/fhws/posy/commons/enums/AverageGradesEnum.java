package de.fhws.posy.commons.enums;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

import javax.xml.bind.annotation.XmlEnumValue;

public enum AverageGradesEnum {

	//@formatter:off
	@XmlEnumValue("1,0") GRADE_10("1.0"),
	@XmlEnumValue("1,3") GRADE_13("1.3"),
	@XmlEnumValue("1,7") GRADE_17("1.7"),
	@XmlEnumValue("2,0") GRADE_20("2.0"),
	@XmlEnumValue("2,3") GRADE_23("2.3"),
	@XmlEnumValue("2,7") GRADE_27("2.7"),
	@XmlEnumValue("3,0") GRADE_30("3.0"),
	@XmlEnumValue("3,3") GRADE_33("3.3"),
	@XmlEnumValue("3,7") GRADE_37("3.7"),
	@XmlEnumValue("4,0") GRADE_40("4.0"),
	@XmlEnumValue("5,0") GRADE_50("5.0");
	//@formatter:on

	private BigDecimal grade;

	private String gradeComma;

	private AverageGradesEnum(String gradeStr) {

		grade = new BigDecimal(gradeStr);

		DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getNumberInstance(Locale.GERMAN);
		decimalFormat.applyPattern("#0.0");
		gradeComma = decimalFormat.format(grade);
	}

	public BigDecimal getGrade() {

		return grade;
	}

	public String getGradeComma() {

		return gradeComma;
	}

}
