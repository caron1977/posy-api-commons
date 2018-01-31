package de.fhws.posy.rest.models;

import de.fhws.posy.commons.interfaces.IExamGrade;

/**
 * @author grimmer
 *
 */
/**
 * @author grimmer
 *
 */
public class ExamGradeJson implements IExamGrade {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String matnr;

	private String examGradeType;

	private String grade;

	public String getMatnr() {

		return matnr;
	}

	public void setMatnr(String matnr) {

		this.matnr = matnr;
	}

	public String getExamGradeType() {

		return examGradeType;
	}

	public void setExamGradeType(String examGradeType) {

		this.examGradeType = examGradeType;
	}

	public String getGrade() {

		return grade;
	}

	public void setGrade(String grade) {

		this.grade = grade;
	}

}
