package de.fhws.posy.commons.enums;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

import javax.xml.bind.annotation.XmlEnumValue;

public enum IntegerGradesEnum {

	//@formatter:off
	@XmlEnumValue("1.0") GRADE_10("1.0"),
	@XmlEnumValue("2.0") GRADE_20("2.0"),
	@XmlEnumValue("3.0") GRADE_30("3.0"),
	@XmlEnumValue("4.0") GRADE_40("4.0"),
	@XmlEnumValue("5.0") GRADE_50("5.0");
	//@formatter:on

	private BigDecimal grade;

	private String gradeComma;

	private IntegerGradesEnum(String gradeStr) {

		grade = new BigDecimal(gradeStr);

		DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getNumberInstance(Locale.GERMAN);
		decimalFormat.applyPattern("#0.0");
		gradeComma = decimalFormat.format(grade);
	}

	public BigDecimal getGrade() {

		return grade;
	}

	public Short getGradeInteger() {

		return grade == null ? null : grade.shortValue();
	}

	public String getGradeComma() {

		return gradeComma;
	}

}
