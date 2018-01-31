package de.fhws.posy.rest.models;

import de.fhws.posy.commons.interfaces.IExamPeriod;

/**
 * @author grimmer
 *
 */
/**
 * @author grimmer
 *
 */
public class ExamPeriodJson implements IExamPeriod {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer semestercode;

	public Integer getSemestercode() {

		return semestercode;
	}

	public void setSemestercode(Integer semestercode) {

		this.semestercode = semestercode;
	}

	@Override
	public String toString() {

		return "ExamPeriodJson [semestercode=" + semestercode + "]";
	}

}
